package com.universe.bluestone.java12;

public class StringTransformExample {
    public static void main(String[] args) {
        String text = "   hello java 12   ";

        // Chain multiple string operations cleanly
        String result = text.transform(String::trim)
                            .transform(String::toUpperCase)
                            .transform(s -> new StringBuilder(s).reverse().toString());

        System.out.println(result); 
        // Output: 21 AVAJ OLLEH
    }
}