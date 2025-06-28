package com.streams;
/*
Problem 28:
Group words by starting character and sort each group alphabetically.
*/

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem28 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "ant", "banana", "bat", "ball", "car");
        Map<Character, List<String>> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.groupingBy(w -> w.charAt(0)));
        System.out.println(sortedWords);

        Map<Character, List<String>> sortedWords2 = words.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0),
                        Collectors.collectingAndThen(Collectors.toList(),
                                l -> {
                                    l.sort(String::compareTo);
                                    return l;
                                })));
        System.out.println(sortedWords2);

        Map<Character, List<String>> sortedWords3 = words.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0),
                        Collectors.collectingAndThen(Collectors.toList(), l -> l.stream().sorted(Comparator.reverseOrder()).toList())));
        System.out.println(sortedWords3);
    }
}
