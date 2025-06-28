package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Problem 16: Join all the strings in a list with a delimiter.
public class StreamProblem16 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Streams", "API");
        String s1 = words.stream().reduce((s, s2) -> s + s2).get();
        System.out.println(s1);

        String s2 = words.stream().collect(Collectors.joining());
        System.out.println(s2);

        String s3 = words.stream().collect(Collectors.joining(","));
        System.out.println(s3);

        String s4 = words.stream().collect(Collectors.joining(",", "prfx", "sfx"));
        System.out.println(s4);
    }
}
