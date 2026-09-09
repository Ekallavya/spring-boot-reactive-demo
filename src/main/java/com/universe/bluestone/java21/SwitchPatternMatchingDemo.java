package com.universe.bluestone.java21;

public class SwitchPatternMatchingDemo {

    public static void main(String[] args) {
        System.out.println(formatObject("Hello World"));  // Matches String
        System.out.println(formatObject(42));             // Matches positive Integer
        System.out.println(formatObject(-5));            // Matches general Integer
        System.out.println(formatObject(null));           // Matches null
        System.out.println(formatObject(3.14));           // Matches default
    }

    public static String formatObject(Object obj) {
        return switch (obj) {
            // 1. Explicit null handling
            case null -> "It's a null value!";
            
            // 2. Type matching with a pattern variable 's'
            case String s -> "String of length: " + s.length();
            
            // 3. Guarded pattern using 'when' for conditional logic
            case Integer i when i > 0 -> "Positive Integer: " + i;
            
            // 4. General type matching for other Integers
            case Integer i -> "Non-positive Integer: " + i;
            
            // 5. Total/Default pattern to handle all other types
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
    }
}