package com.universe.bluestone.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        // Creating a list of Strings
        List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

        // Using reduce to find the longest string in the list
        Optional<String> longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);

        // String array to combine
        String[] array = { "Geeks", "for", "Geeks" };

        // Using reduce to concatenate strings with a hyphen
        Optional<String> combinedString = Arrays.stream(array)
                .reduce((str1, str2) -> str1 + "-" + str2);

        // Displaying the combined String
        combinedString.ifPresent(System.out::println);

    }
}
