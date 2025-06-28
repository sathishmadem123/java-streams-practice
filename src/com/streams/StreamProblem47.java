package com.streams;/*
Problem 47:
Find duplicate characters in a string.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem47 {
    public static void main(String[] args) {
        String input = "programming";
        List<Character> duplicateCharacters = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(duplicateCharacters);
    }
}
