package com.streams;
/*
Problem 45:
Group people by age group: "Minor" (<18), "Adult" (18–60), "Senior" (>60).
Use streams to categorize people into age groups.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem45 {
    public static void main(String[] args) {
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String toString() {
                return name + " (" + age + ")";
            }
        }

        List<Person> people = List.of(
                new Person("Alice", 17),
                new Person("Bob", 25),
                new Person("Charlie", 65),
                new Person("Sathish", 18)
        );

        Map<String, List<Person>> ageGroups = people.stream()
                .collect(Collectors.groupingBy(p -> {
                    if (p.age < 18)
                        return "Minor";
                    else if (p.age <= 60)
                        return "Adult";
                    else
                        return "Senior";
                }));
        System.out.println(ageGroups);
    }
}

