package com.streams;
/*
Problem 37:
Flatten a nested list of integers and sort the result.
*/

import java.util.List;

public class StreamProblem37 {
    public static void main(String[] args) {
        List<List<Integer>> nested = List.of(List.of(3, 1), List.of(2, 4));
        List<Integer> sorted = nested.stream()
                .flatMap(List::stream)
                .sorted()
                .toList();
        System.out.println(sorted);
    }
}
