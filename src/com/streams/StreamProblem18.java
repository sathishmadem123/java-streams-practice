package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Problem 18: Find and print duplicate elements from a list.
public class StreamProblem18 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Map<String, Long> duplicatesMap = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        List<String> duplicates = duplicatesMap
                .keySet()
                .stream()
                .filter(k -> duplicatesMap.get(k) > 1)
                .toList();
        System.out.println(duplicates);

        List<String> duplicatesEntry = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey).toList();
        System.out.println(duplicatesEntry);
    }
}
