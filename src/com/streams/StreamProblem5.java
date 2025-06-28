package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Problem 5: Sort a list of integers in ascending and descending order.
public class StreamProblem5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        System.out.println("Ascending Order: ");
        numbers.stream().sorted().toList().forEach(System.out::println);

        System.out.println("Descending Order: ");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
