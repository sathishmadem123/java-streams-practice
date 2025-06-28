package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Problem 19: Count how many times each word appears in a list.
public class StreamProblem19 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry");

        Map<String, Long> wordFrequency = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(wordFrequency);
    }
}
