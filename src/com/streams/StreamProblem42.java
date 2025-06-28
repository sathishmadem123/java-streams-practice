package com.streams;/*
Problem 42:
Convert a list of strings to a single string with unique characters only.
*/

import java.util.List;
import java.util.stream.Collectors;

public class StreamProblem42 {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "bcd", "cde");
        String single = list.stream()
                .flatMap(e -> e.chars().mapToObj(c -> (char) c))
                .distinct()
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(single);
    }
}
