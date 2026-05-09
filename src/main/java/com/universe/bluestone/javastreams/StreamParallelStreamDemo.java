package com.universe.bluestone.javastreams;

public class StreamParallelStreamDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Create a parallel stream and perform some operations
        long count = java.util.stream.IntStream.range(0, 1000000)
                .parallel()
                .filter(i -> i % 2 == 0)
                .count();

        long endTime = System.currentTimeMillis();
        System.out.println("Count of even numbers: " + count);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
