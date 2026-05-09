package com.universe.bluestone.javastreams;

import java.util.stream.Stream;

public class StreamIterateDemo {
    public static void main(String[] args) {
        System.out.println("Generating a sequence using Stream.iterate():");
        Stream.iterate(1, n -> n + 1)
                               .limit(5)
                               .forEach(System.out::println);

        Stream.iterate(1, n -> n < 20, n -> n * 2)
                .forEach(System.out::println);

    }
}
