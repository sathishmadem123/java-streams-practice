package com.streams;/*
Problem 36:
Create a frequency map of word lengths.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem36 {
    public static void main(String[] args) {
        List<String> words = List.of("hi", "hello", "world", "ok", "Sathish");
        Map<Integer, Long> frequencyOfLengths= words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(frequencyOfLengths);

    }
}
