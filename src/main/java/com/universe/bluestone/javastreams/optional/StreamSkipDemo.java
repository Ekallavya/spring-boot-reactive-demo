package com.universe.bluestone.javastreams.optional;

import reactor.core.publisher.Flux;

import java.util.stream.Stream;

public class StreamSkipDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1,i-> i<90,i -> i + 1);
        stream.skip(50).forEach(System.out::println);
    }
}
