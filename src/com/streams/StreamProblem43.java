package com.streams;
/*
Problem 43:
Find the second-highest number in a list.
*/

import java.util.Comparator;
import java.util.List;

public class StreamProblem43 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,4,5);
        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(null);
        System.out.println(secondHighest == null ? "Second highest number is not available" : secondHighest);
    }
}
