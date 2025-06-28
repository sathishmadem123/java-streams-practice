package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Problem 13: Group employees by their department.
public class StreamProblem13 {
    public static void main(String[] args) {
        class Employee {
            String name;
            String department;

            Employee(String name, String department) {
                this.name = name;
                this.department = department;
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "name='" + name + '\'' +
                        ", department='" + department + '\'' +
                        '}';
            }
        }

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR")
        );
        Map<String, List<Employee>> groupedByDepartment = employees.stream().collect(Collectors.groupingBy(e -> e.department));
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(e -> e.department, Collectors.counting()));
        System.out.println(groupedByDepartment);
        System.out.println(collect);
    }
}
