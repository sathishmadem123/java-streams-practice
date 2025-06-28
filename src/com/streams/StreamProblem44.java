package com.streams;/*
Problem 44:
Check if any string in the list is a palindrome.
*/

import java.util.List;

public class StreamProblem44 {
    public static void main(String[] args) {
        List<String> words = List.of("level", "world", "radar", "java");
        List<String> palindromeStrings = words.stream()
                .filter(w -> {
                    StringBuilder s = new StringBuilder(w);
                    return s.reverse().toString().equals(w);
                }).toList();
        System.out.println(palindromeStrings);

        boolean isPalindromeFound = words.stream()
                .anyMatch(w -> {
                    StringBuilder s = new StringBuilder(w);
                    return s.reverse().toString().equals(w);
                });
        System.out.println(isPalindromeFound);
    }
}
