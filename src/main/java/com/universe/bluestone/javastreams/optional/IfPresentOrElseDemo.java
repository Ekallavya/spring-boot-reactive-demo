package com.universe.bluestone.javastreams.optional;

import java.util.Optional;

public class IfPresentOrElseDemo {
    public static void main(String[] args) {
        String value = "Hello, World!";
        Optional<String> optionalValue = Optional.ofNullable(value);

        optionalValue.ifPresentOrElse(
            v -> System.out.println("Value is present: " + v),
            () -> System.out.println("Value is not present")
        );

        // Example with an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        emptyOptional.ifPresentOrElse(
            v -> System.out.println("Value is present: " + v),
            () -> System.out.println("Value is not present")
        );
    }
}
