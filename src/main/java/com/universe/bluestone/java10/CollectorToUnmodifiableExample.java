package com.universe.bluestone.java10;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorToUnmodifiableExample {
    public static void main(String[] args) {
        List<String> names = List.of("Java", "Python", "C++", "JavaScript");

        // Collect filtered elements into an unmodifiable list
        List<String> result = names.stream()
                .filter(n -> n.startsWith("J"))
                .collect(Collectors.toUnmodifiableList());

        System.out.println(result);

        // Attempting to modify 'result' throws UnsupportedOperationException
    }
}