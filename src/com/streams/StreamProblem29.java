package com.streams;/*
Problem 29:
Partition a list of numbers into odd and even numbers.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem29 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 7, 2, 6, 1);
        Map<Boolean, List<Integer>> partitionedNumber = numbers.stream()
                .sorted()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(partitionedNumber);

        Map<String, List<Integer>> partitionedNumbers2 = numbers.stream()
                .collect(Collectors.groupingBy(i -> i % 2 == 0 ? "Even" : "Odd",
                        Collectors.collectingAndThen(Collectors.toList(),
                                l -> l.stream().sorted().toList())));
        System.out.println(partitionedNumbers2);
    }
}
