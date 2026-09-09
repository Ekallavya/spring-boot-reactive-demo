package com.universe.bluestone.javastreams.optional;

import java.util.Optional;

public class OrElseGetDemo {
    public static void main(String[] args) {
        String value = null;

        // Using orElseGet with a supplier
        String result = Optional.ofNullable(value)
                .orElseGet(() -> "Default Value");

        System.out.println(result); // Output: Default Value

        Optional<String>  temp = Optional.of("Now or Never");
        String str = temp.orElse("Default Value");
    }
}
