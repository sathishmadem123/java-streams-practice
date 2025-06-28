package com.streams;
/*
Problem 24:
Filter and collect only distinct elements starting with a specific prefix.
*/

import java.util.List;

public class StreamProblem24 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "apricot", "banana", "apple", "apple", "apricot");
        String prefix = "ap";
        List<String> distinct = words.stream()
                .filter(e -> e.startsWith(prefix))
                .distinct().toList();

        System.out.println(distinct);
    }
}
