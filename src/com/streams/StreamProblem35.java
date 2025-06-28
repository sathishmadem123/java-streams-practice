package com.streams;/*
Problem 35:
Find words that occur only once in the list.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem35 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "cherry", "date", "cherry");
        List<String> uniqueWords = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(uniqueWords);
    }
}
