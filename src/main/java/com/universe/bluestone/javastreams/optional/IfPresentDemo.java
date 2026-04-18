package com.universe.bluestone.javastreams.optional;

import java.util.Optional;

public class IfPresentDemo {
    public static void main(String[] args) {
        String value = "Hello, World!";
        Optional<String> optionalValue = Optional.ofNullable(value);

        // Using ifPresent to print the value if it is present
        optionalValue.ifPresent(System.out::println);
        //optionalValue.

        // Example with an empty Optional
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresent(System.out::println); // This will not print anything
    }

}
