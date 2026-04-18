package com.universe.bluestone.javastreams.optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {
        String value = null;

        // Using orElseThrow to throw an exception if the value is null
        try {
            String result = java.util.Optional.ofNullable(value)
                    .orElseThrow(() -> new IllegalArgumentException("Value cannot be null"));
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
