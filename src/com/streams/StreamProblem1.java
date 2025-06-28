package com.streams;

import java.util.Arrays;
import java.util.List;

// Problem 1: Convert all strings in a list to uppercase using Stream's map() method.
public class StreamProblem1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> upperCaseWords = words.stream().map(String::toUpperCase).toList();
        upperCaseWords.forEach(System.out::println);
    }
}


