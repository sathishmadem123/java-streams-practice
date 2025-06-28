package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Problem 12: Find the maximum and minimum number in a list.
public class StreamProblem12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 2, 19, 8);
        int max = numbers.stream().max(Comparator.comparingInt(i -> i)).get();
        System.out.println(max);
    }
}
