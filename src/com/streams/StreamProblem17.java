package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Problem 17: Find the top 3 highest salaries from a list of employees.
public class StreamProblem17 {
    public static void main(String[] args) {
        class Employee {
            String name;
            double salary;

            Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }
        }

        List<Employee> employees = Arrays.asList(
                new Employee("John", 40000),
                new Employee("Jane", 80000),
                new Employee("Jake", 60000),
                new Employee("Jill", 75000)
        );

        List<Double> top3Salaries = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getSalary)
                .toList();
        System.out.println(top3Salaries);
    }
}
