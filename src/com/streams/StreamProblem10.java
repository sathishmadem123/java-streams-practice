package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Problem 10: Convert a list to a set.
public class StreamProblem10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "grape");
        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);
    }
}
