package com.universe.bluestone.javastreams.optional;

import java.util.Optional;

public class OrDemo {
    public static void main(String[] args) {
        String value1 = null;
        String value2 = "Hello, World!";

        // Using Optional.or() to provide an alternative value
        String result = Optional.ofNullable(value1)
                .or(() -> Optional.ofNullable(value2))
                .orElse("Default Value");

        System.out.println(result); // Output: Hello, World!
    }
}
