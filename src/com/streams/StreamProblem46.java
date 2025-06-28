package com.streams;/*
Problem 46:
Partition numbers into prime and non-prime.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem46 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(i -> {
                    if (i == 2)
                        return true;
                    else {
                        for (int j = 2; j <= i/2; j++) {
                            if (i % j == 0)
                                return false;
                        }
                    }
                    return true;
                }));
        System.out.println(partitionedNumbers);
    }
}
