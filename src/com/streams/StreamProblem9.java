package com.streams;

import java.util.Arrays;
import java.util.List;

// Problem 9: Convert a list of integers to their squares.
public class StreamProblem9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> squaresList = list.stream().map(num -> num*num).toList();
        System.out.println(squaresList);
    }
}
