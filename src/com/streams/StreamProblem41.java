package com.streams;
/*
Problem 41:
Get the total salary paid to employees older than 30.
Filter the list of employees and sum the salaries of those older than 30.
*/

import java.util.List;

public class StreamProblem41 {
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
        }

        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 45000, 28),
                new Employee("Bob", "IT", 60000, 31),
                new Employee("Charlie", "HR", 50000, 35)
        );

        Double paidSalary = employees.stream()
                .filter(e -> e.age > 30)
                .map(e -> e.salary)
                .reduce(Double::sum).orElse(0.0);
        System.out.println(paidSalary);

        double paidSalary2 = employees.stream()
                .filter(e -> e.age > 30)
                .mapToDouble(e -> e.salary)
                .sum();
        System.out.println(paidSalary2);
    }
}

