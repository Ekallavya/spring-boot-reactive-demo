package com.universe.bluestone.javastreams.optional;

import java.util.Optional;

public class IsEmptyDemo {
    public static void main(String[] args) {
        Optional<String> optionalWithValue = Optional.of("Hello, World!");
        Optional<String> emptyOptional = Optional.empty();

        // Check if the optional with value is empty
        boolean isOptionalWithValueEmpty = optionalWithValue.isEmpty();
        System.out.println("Is optionalWithValue empty? " + isOptionalWithValueEmpty); // Output: false

        // Check if the empty optional is empty
        boolean isEmptyOptionalEmpty = emptyOptional.isEmpty();
        System.out.println("Is emptyOptional empty? " + isEmptyOptionalEmpty); // Output: true
    }
    
}
