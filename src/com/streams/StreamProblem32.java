package com.streams;/*
Problem 32:
Convert a list of strings into a map with key = string, value = length.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem32 {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world", "hi", "Sathish");
        Map<String, Integer> convertedMap = words.stream()
                .collect(Collectors.toMap(w -> w, String::length));

        System.out.println(convertedMap);
    }
}