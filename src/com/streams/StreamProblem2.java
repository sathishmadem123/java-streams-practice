package com.streams;

import java.util.Arrays;
import java.util.List;

// Problem 2: Use filter() to extract even numbers from a list of integers.
public class StreamProblem2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(x -> x % 2 == 0).toList().forEach(System.out::println);
    }
}

