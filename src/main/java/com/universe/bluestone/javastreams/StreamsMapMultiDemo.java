package com.universe.bluestone.javastreams;

public class StreamsMapMultiDemo {
    public static void main(String[] args) {
        // Example of using mapMulti to flatten a stream of lists
        var listOfLists = java.util.List.of(
                java.util.List.of(1, 2, 3),
                java.util.List.of(4, 5),
                java.util.List.of(6, 7, 8, 9)
        );

        var flattenedStream = listOfLists.stream()
                .mapMulti((list, consumer) -> list.forEach(consumer));

        System.out.println("Flattened Stream:");
        flattenedStream.forEach(System.out::println);
    }
}
