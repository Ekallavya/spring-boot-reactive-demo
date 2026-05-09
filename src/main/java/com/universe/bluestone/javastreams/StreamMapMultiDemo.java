package com.universe.bluestone.javastreams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapMultiDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        List<Integer> expanded = numbers.stream()
                .<Integer>mapMulti((num, consumer) -> {
                    consumer.accept(num);        // First output
                    consumer.accept(num +num);  // Second output
                    consumer.accept(num * num);  // Third output
                })
                .collect(Collectors.toList());

        System.out.println(expanded); // Output: [1, 2, 1, 2, 4, 4, 3, 6, 9]
    }
}
