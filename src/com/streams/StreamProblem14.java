package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Problem 14: Divide a list of integers into even and odd numbers.
public class StreamProblem14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Map<String, List<Integer>> collect1 = numbers.stream().collect(Collectors.groupingBy(i -> i % 2 == 0 ? "Even" : "Odd"));
        System.out.println(collect);
        System.out.println(collect1);
    }
}
