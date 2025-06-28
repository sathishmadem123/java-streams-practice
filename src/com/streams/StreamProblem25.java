package com.streams;
/*
Problem 25:
Sort a list of strings by their lengths and then alphabetically.
*/

import java.util.Comparator;
import java.util.List;

public class StreamProblem25 {
    public static void main(String[] args) {
        List<String> words = List.of("pear", "banana", "fig", "fag", "apple");
        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(String::compareTo)).toList();
        System.out.println(sortedWords);
    }
}
