package com.streams;/*
Problem 27:
Convert a list of integers into a map where key = number, value = square of number.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem27 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 2);
        Map<Integer, Integer> map = numbers.stream()
                .collect(Collectors.toMap(i -> i, i -> i*i, Integer::sum));
        System.out.println(map);
    }
}
