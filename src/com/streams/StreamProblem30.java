package com.streams;
/*
Problem 30:
Find the most frequent element in a list.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem30 {
    public static void main(String[] args) {
        List<String> items = List.of("a", "b", "a", "c", "b", "b", "b", "a");
        String mostFrequent = items.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(mostFrequent);
    }
}
