package com.streams;/*
Problem 48:
Find the first repeated word in a list.
*/

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamProblem48 {
    public static void main(String[] args) {
        List<String> words = List.of("one", "two", "three", "two", "four");
        String firstDuplicate = words.stream()
                .collect(Collectors.groupingBy(w -> w, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .findFirst().get()
                .getKey();

        System.out.println(firstDuplicate);

        Set<String> seen = new HashSet<>();
        String firstDuplicate2 = words.stream()
                .filter(w -> !seen.add(w))
                .findFirst()
                .orElse(null);
        System.out.println(firstDuplicate2);
    }
}
