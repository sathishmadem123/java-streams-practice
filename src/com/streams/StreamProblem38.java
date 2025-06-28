package com.streams;/*
Problem 38:
Get summary statistics of a list of integers.
*/

import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamProblem38 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 1, 9);
        IntSummaryStatistics statistics = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(statistics);
    }
}
