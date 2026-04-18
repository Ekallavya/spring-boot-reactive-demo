package com.universe.bluestone.javastreams.optional;

import java.util.Optional;

public class FlatMap {
        public static void main(String[] args) {
            // Example of flatMap with Optional
            Optional<String> optionalString = Optional.of("Hello");

            // Using flatMap to transform the value inside the Optional
            Optional<Integer> optionalLength = optionalString.flatMap(s -> Optional.of(s.length()));
            // Output the result
            optionalLength.ifPresent(length -> System.out.println("Length of the string: " + length));
        }
}
