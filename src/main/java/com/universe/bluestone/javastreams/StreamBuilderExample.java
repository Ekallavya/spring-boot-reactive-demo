package com.universe.bluestone.javastreams;

import java.util.stream.Stream;

public class StreamBuilderExample {
    public static void main(String[] args) {
        // 1. Create a Stream.Builder instance for strings
        Stream.Builder<String> builder = Stream.builder();

        // 2. Add elements to the builder using the add() method
        builder.add("Production");
        builder.add("Marketing");
        builder.add("Finance");
        builder.add("Sales");
        builder.add("Operations");

        // 3. Build the stream
        Stream<String> stream = builder.build();

        // 4. Process the elements of the built stream
        stream.forEach(System.out::println);
    }
}