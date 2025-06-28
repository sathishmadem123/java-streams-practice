package com.streams;

import java.util.Arrays;
import java.util.List;

// Problem 6: Remove duplicate values from a list.
public class StreamProblem6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry");
        list.stream().distinct().toList().forEach(System.out::println);
    }
}
