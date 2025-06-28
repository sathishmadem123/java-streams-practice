package com.streams;
/*
Problem 33:
Sort employees first by department, then by descending salary.
*/

import java.util.Comparator;
import java.util.List;

public class StreamProblem33 {
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

            public String toString() {
                return name + " (" + department + ", " + salary + ")";
            }
        }

        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 45000, 28),
                new Employee("Bob", "IT", 60000, 31),
                new Employee("Charlie", "HR", 50000, 35),
                new Employee("Sathish", "HR", 70000, 35),
                new Employee("Madem", "IT", 70000, 35)
        );


        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Comparator.comparing(Employee::getSalary).reversed())).toList();

        System.out.println(sortedEmployees);
    }
}

