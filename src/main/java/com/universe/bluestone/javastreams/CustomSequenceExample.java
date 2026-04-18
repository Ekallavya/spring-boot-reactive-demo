package com.universe.bluestone.javastreams;

import java.util.stream.Stream;

public class CustomSequenceExample {
    private static int counter = 0;

    public static void main(String[] args) {
        // Note: Using a stateful lambda is generally discouraged in parallel streams.
        Stream<String> customStream = Stream.generate(() -> {
                                                counter++;
                                                return "Item-" + counter;
                                            })
                                            .limit(4);

        System.out.println("Generating a custom sequence (sequentially):");
        customStream.forEach(System.out::println);
    }
}