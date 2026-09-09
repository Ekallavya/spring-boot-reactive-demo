package com.universe.bluestone.java23;

public class PrimitiveInstanceOf {
    public static void main(String[] args) {
        long bigNumber = 42L;
        long hugeNumber = 3_000_000_000L; // Exceeds Integer.MAX_VALUE

        // Matches because 42 safely fits into an int
        if (bigNumber instanceof int i) {
            System.out.println("Success! Fits in int: " + i);
        }

        // Fails to match because 3 billion overflows a standard 32-bit int
        if (hugeNumber instanceof int i) {
            System.out.println("This will not print.");
        } else {
            System.out.println("Loss of data! Cannot safely cast " + hugeNumber + " to an int.");
        }
    }
}