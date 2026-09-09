package com.universe.bluestone.java23;

public class PrimitiveSwitchExample {
    public static void checkNumber(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's a boxed Integer: " + i);
            case Double d  -> System.out.println("It's a boxed Double: " + d);
            default        -> System.out.println("Other object type");
        }
    }

    public static void inspectPrimitive(long value) {
        switch (value) {
            // Matches if value safely downcasts to byte AND is less than 10
            case byte b when b < 10 -> 
                System.out.println("Small byte value: " + b);
                
            // Matches if value safely downcasts to byte
            case byte b -> 
                System.out.println("Fits perfectly in a byte: " + b);
                
            // Matches if value safely downcasts to int
            case int i -> 
                System.out.println("Fits perfectly in an int: " + i);
                
            // Fallback for values that only fit in a long
            case long l -> 
                System.out.println("Large long value: " + l);
        }
    }

    public static void main(String[] args) {
        inspectPrimitive(5L);     // Matches: Small byte value
        inspectPrimitive(100L);   // Matches: Fits perfectly in a byte
        inspectPrimitive(50000L); // Matches: Fits perfectly in an int
    }
}