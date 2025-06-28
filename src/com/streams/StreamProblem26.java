package com.streams;
/*
Problem 26:
Find the average salary of employees in each department.
Group employees by department and calculate the average salary.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem26 {
    public static void main(String[] args) {
        class Employee {
            String name;
            String department;
            double salary;
            int age;

            Employee(String name, String department, double salary, int age) {
                this.name = name;
                this.department = department;
                this.salary = salary;
                this.age = age;
            }

            Employee() {}

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
        }

        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 45000, 28),
                new Employee("Bob", "IT", 60000, 31),
                new Employee("Charlie", "HR", 50000, 35),
                new Employee("Bob", "IT", 40000, 31)
        );
        Map<String, Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .values().stream()
                .map(e -> {
                    Employee averageEmployee = new Employee();
                    Double averageSalary = e.stream().collect(Collectors.averagingDouble(Employee::getSalary));
                    averageEmployee.setSalary(averageSalary);
                    averageEmployee.setDepartment(e.getFirst().department);
                    return averageEmployee;
                }).collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary));
        System.out.println(averageSalaries);

        Map<String, Double> finalAverageSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(finalAverageSalaries);
    }
}
