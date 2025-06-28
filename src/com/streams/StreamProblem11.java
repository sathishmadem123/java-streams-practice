package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Problem 11: Sort a list of employees by their salary.
public class StreamProblem11 {
    public static void main(String[] args) {
        class Employee {
            String name;
            double salary;
            Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }

            @Override
            public String toString() {
                return name + " - " + salary;
            }
        }


        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 70000),
            new Employee("Bob", 50000),
            new Employee("Charlie", 60000)
        );
        // TODO: Sort employees by salary
        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparingDouble((Employee e) -> e.salary)).toList();
        sortedEmployees.forEach(System.out::println);
    }
}
