package com.universe.bluestone.java21;

public class StringLinesDemo {
    public static void main(String[] args) {
        String multiLineString = """
                This is a multi-line string.
                It can span multiple lines without needing concatenation.
                Each line is preserved as it is.""";

        System.out.println("Original Multi-line String:");
        System.out.println(multiLineString);

        System.out.println("\nLines in the Multi-line String:");
        multiLineString.lines().forEach(System.out::println);
    }
}
