package com.universe.bluestone.java22;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Gatherers;

public class GathersWindowSlidingExample {
    public static void main(String[] args) {
        List<List<Integer>> slidingWindows = Stream.of(1, 2, 3, 4, 5)
            .gather(Gatherers.windowSliding(3))
            .toList();

        // Output: [[1, 2, 3], [2, 3, 4], [3, 4, 5]]
        System.out.println(slidingWindows);
    }
}