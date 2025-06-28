package com.streams;
/*
Problem 23:
Find the employee with the highest salary in each department.
Group employees by department and find the one with the maximum salary in each group.
*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem23 {
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

            public String toString() {
                return name + " (" + department + ", " + salary + ")";
            }
        }

        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 45000, 28),
                new Employee("Bob", "IT", 60000, 31),
                new Employee("Charlie", "HR", 50000, 35),
                new Employee("Sathish", "HR", 70000, 35),
                new Employee("Madem", "IT", 80000, 31)
        );

        Map<String, List<Employee>> highestSalaryEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(highestSalaryEmployees);

        Map<String, Employee> highest = highestSalaryEmployees.keySet()
                .stream()
                .flatMap(e -> highestSalaryEmployees.get(e).stream())
                .max(Comparator.comparingDouble(Employee::getSalary)).map(e -> {
                    Map<String, Employee> hashMap = new HashMap<>();
                    hashMap.put(e.getDepartment(), e);
                    return hashMap;
                }).orElse(null);
        System.out.println(highest);

        Map<String, Employee> highest2 = highestSalaryEmployees.keySet()
                .stream()
                .map(k -> {
                    return highestSalaryEmployees.get(k).stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
                }).collect(Collectors.toMap(Employee::getDepartment, e -> e));

        System.out.println(highest2);

        Map<String, Employee> finalHighestSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet().stream()
                .map(e -> e.getValue().stream().max(Comparator.comparingDouble(Employee::getSalary)).get())
                .collect(Collectors.toMap(Employee::getDepartment, e -> e));
        System.out.println(finalHighestSalary);

    }
}
