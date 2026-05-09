package com.universe.bluestone.javastreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingExample {
    public static void main(String[] args) {
        // 1. Create a primitive IntStream
        IntStream primitiveStream = IntStream.rangeClosed(1, 5);

        System.out.println(primitiveStream);
        // 2. Autoboxing: convert int primitives to Integer objects
        // Required because Collectors.toList() needs a Stream<Integer>, not an IntStream
        List<Integer> integerList = primitiveStream
                                    .boxed()
                                    .toList();

        System.out.println("Boxed List: " + integerList); // [1, 2, 3, 4, 5]

        // Creating an IntStream
        IntStream stream = IntStream.range(6, 10);

        // Displaying the elements in range
        // including the lower bound but
        // excluding the upper bound
        stream.forEach(System.out::println);
    }
}