package com.universe.bluestone.javastreams;

public class StreamIndexDemo {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Using IntStream to get indices and values
        java.util.stream.IntStream.range(0, names.length)
            .forEach(i -> System.out.println("Index: " + i + ", Name: " + names[i]));
    }
}
