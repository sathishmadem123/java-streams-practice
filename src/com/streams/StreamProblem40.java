package com.streams;
/*
Problem 40:
Get the top 3 longest names.
*/

import java.util.Comparator;
import java.util.List;

public class StreamProblem40 {
    public static void main(String[] args) {
        List<String> names = List.of("Zara", "Jonathan", "Amy", "Chris", "Sathish", "Saatish");
        List<String> top3 = names.stream()
                .sorted(Comparator.comparingInt(String::length).reversed()
                        .thenComparing(s -> s))
                .limit(3).toList();
        System.out.println(top3);
    }
}
