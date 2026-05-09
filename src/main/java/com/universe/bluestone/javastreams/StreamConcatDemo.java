package com.universe.bluestone.javastreams;

import java.util.stream.Stream;

public class StreamConcatDemo {
    public static void main(String[] args) {
        // Create two streams of integers
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);

        // Concatenate the two streams
        Stream<Integer> mergedStream = Stream.concat(stream1, stream2);

        // Print the elements of the merged stream
        System.out.println("Merged Stream Elements:");
        mergedStream.forEach(System.out::println);
    }
}