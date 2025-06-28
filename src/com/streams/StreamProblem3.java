package com.streams;

import java.util.Arrays;
import java.util.List;

// Problem 3: Find the first string in the list with length greater than 5 using filter() and findFirst().
public class StreamProblem3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alexander", "Eva", "Bob");
        String firstName = names.stream().filter(x -> x.length() > 5).findFirst().get();
        System.out.println(firstName);
    }
}

