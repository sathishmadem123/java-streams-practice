package com.streams;

import java.util.Arrays;
import java.util.List;

// Problem 4: Count how many strings in the list have more than 3 characters.
public class StreamProblem4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee");
        long count = list.stream().filter(x -> x.length() > 3).count();
        System.out.println(count);
    }
}
