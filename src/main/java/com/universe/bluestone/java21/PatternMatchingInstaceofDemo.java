package com.universe.bluestone.java21;

public class PatternMatchingInstaceofDemo {
    public static void main(String[] args) {
        Object obj = "Hello, World!";

        if (obj instanceof String str) {
            System.out.println("The string is: " + str);
        } else {
            System.out.println("The object is not a string.");
        }
    }
}
