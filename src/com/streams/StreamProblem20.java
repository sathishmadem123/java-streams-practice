package com.streams;
/*
Problem 20:
Remove duplicate elements from a list using streams.
Given a list with duplicate integers, remove duplicates and return a list with only unique values.
*/

import java.util.List;

public class StreamProblem20 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueValues = numbers.stream().distinct().toList();
        System.out.println(uniqueValues);
    }
}
