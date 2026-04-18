package com.universe.bluestone.javastreams;

import java.util.stream.Stream;

public class StreamsGenerateDemo {
    public static void main(String[] args) {
        Stream<Double> randomStream = Stream.generate(Math::random)
                                            .limit(5); // Limits the stream to 5 elements

        System.out.println("Generating 5 random numbers:");
        randomStream.forEach(System.out::println);
    }
}