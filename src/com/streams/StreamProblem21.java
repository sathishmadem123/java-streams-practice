package com.streams;/*
Problem 21:
Find the frequency of each character in a string using streams.
*/

import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem21 {
    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Long> frequency = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(frequency);
    }
}
