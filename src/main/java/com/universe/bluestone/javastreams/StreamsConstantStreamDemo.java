package com.universe.bluestone.javastreams;

import java.util.stream.Stream;

public class StreamsConstantStreamDemo {
    public static void main(String[] args) {
        Stream<String> helloStream = Stream.generate(() -> "Hello, World!")
                                           .limit(3); // Limits the stream to 3 elements

        System.out.println("Generating a stream of constant values:");
        helloStream.forEach(System.out::println);
    }
}