package com.streams;
/*
Problem 22:
Count the number of employees in each department.
Given a list of Employee objects, group them by department and count how many employees are in each department.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem22 {
    public static void main(String[] args) {
        class Employee {
            String name;
            String department;
            double salary;
            int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }

            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            Employee(String name, String department, double salary, int age) {
                this.name = name;
                this.department = department;
                this.salary = salary;
                this.age = age;
            }
        }

        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 45000, 28),
                new Employee("Bob", "IT", 60000, 31),
                new Employee("Charlie", "HR", 50000, 35)
        );

        Map<String, Long> departmentList = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(departmentList);
    }
}
