package com.streams;

import java.util.Arrays;
import java.util.List;

// Problem 8: Check if all strings in the list are non-empty.
public class StreamProblem8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World", "");
        boolean match = list.stream().allMatch(String::isEmpty);
        System.out.println(match);
    }
}
