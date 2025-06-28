package com.streams;/*
Problem 49:
Find the longest palindrome string in a list.
*/

import java.util.Comparator;
import java.util.List;

public class StreamProblem49 {
    public static void main(String[] args) {
        List<String> words = List.of("madam", "racecar", "apple", "wow", "abcddcba");
        String longestPalindrome = words.stream()
                .filter(w -> {
                    StringBuilder s = new StringBuilder(w);
                    return s.reverse().toString().equals(w);
                }).max(Comparator.comparing(String::length)).get();
        System.out.println(longestPalindrome);
    }
}
