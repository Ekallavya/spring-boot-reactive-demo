package com.universe.bluestone.javastreams;

public class StreamsTakeWhileDemo {
    public static void main(String[] args) {
        // Example of takeWhile with a stream of integers
        System.out.println("TakeWhile Demo:");
        java.util.stream.IntStream.range(1, 10)
                .takeWhile(n -> n < 5)
                .forEach(System.out::println);
    }
}
