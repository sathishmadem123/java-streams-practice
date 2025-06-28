package com.streams;
/*
Problem 31:
Join a list of strings using a delimiter, prefix, and suffix.
*/

import java.util.List;
import java.util.stream.Collectors;

public class StreamProblem31 {
    public static void main(String[] args) {
        List<String> items = List.of("a", "b", "c");
        String joinedString = items.stream()
                .collect(Collectors.joining("/", "prefix", "suffex"));
        System.out.println(joinedString);
    }
}
