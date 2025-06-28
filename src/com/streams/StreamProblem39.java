package com.streams;
/*
Problem 39:
Get a comma-separated string of all uppercase names.
*/

import java.util.List;
import java.util.stream.Collectors;

public class StreamProblem39 {
    public static void main(String[] args) {
        List<String> names = List.of("john", "doe", "smith");
        String upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(upper);
    }
}
