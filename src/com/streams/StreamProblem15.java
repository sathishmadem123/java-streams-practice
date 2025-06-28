package com.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// Problem 15: Convert a list of lists into a single list.
public class StreamProblem15 {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d")
        );
        List<String> list = nested.stream().flatMap(Collection::stream).toList();
        System.out.println(list);
    }
}
