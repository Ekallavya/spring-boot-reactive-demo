package com.universe.bluestone.java22;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Gatherers;

public class GathersWindowFixedExample {
    public static void main(String[] args) {
        List<List<Integer>> fixedWindows = Stream.of(1, 2, 3, 4, 5, 6, 7)
            .gather(Gatherers.windowFixed(3))
            .toList();

        // Output: [[1, 2, 3], [4, 5, 6], [7]]
        System.out.println(fixedWindows);
    }
}