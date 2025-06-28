package com.streams;

import java.util.Arrays;
import java.util.List;

// Problem 7: Check if any string in the list starts with the letter "A".
public class StreamProblem7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Cherry");
        list.stream().filter(x -> x.startsWith("A")).toList().forEach(System.out::println);
    }
}
