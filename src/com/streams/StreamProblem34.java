package com.streams;/*
Problem 34:
Count number of words with length greater than 5.
*/

import java.util.List;

public class StreamProblem34 {
    public static void main(String[] args) {
        List<String> words = List.of("short", "longword", "medium", "tiny", "enormous", "Sathish", "Madem");
        long numberOfWords = words.stream()
                .filter(w -> w.length() > 5)
                .count();
        System.out.println(numberOfWords);
    }
}
