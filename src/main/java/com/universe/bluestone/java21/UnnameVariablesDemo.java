package com.universe.bluestone.java21;

import java.util.List;

public class UnnameVariablesDemo {
    public static void main(String[] args) {

        List<String> list = List.of("A", "B", "C");
        int totalCount = 0;

        for (String _ : list) { // Underscore replaces 'order'
            totalCount++;
        }
        System.out.println("Total count: " + totalCount);
        try {
            int number = Integer.parseInt("xyz");
        } catch (NumberFormatException _) { // Underscore replaces 'ex'
            System.out.println("Invalid number format. Please try again.");
        }
    }
}
