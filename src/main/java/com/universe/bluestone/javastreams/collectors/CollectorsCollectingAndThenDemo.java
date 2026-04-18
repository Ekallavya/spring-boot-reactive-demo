package com.universe.bluestone.javastreams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsCollectingAndThenDemo {
    public static void main(String[] args) {
            String result = Stream.of("I", "Love", "Stack Overflow")
                    .collect(Collectors.collectingAndThen(
                            Collectors.joining(" "), // Collector to join the strings with a space
                            String::toUpperCase // Finisher to convert the result to uppercase
                    ));

            System.out.println(result); // Output: "I LOVE STACK OVERFLOW"
    }
}
