package com.universe.bluestone.javastreams;

public class StreamParallelStreamDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Create a parallel stream and perform some operations
        long count = java.util.stream.LongStream.range(0, 100000000L)
                .parallel()
                .filter(i -> i % 2 == 0)
                .count();

        long endTime = System.currentTimeMillis();
        System.out.println("Count of even numbers: " + count);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
