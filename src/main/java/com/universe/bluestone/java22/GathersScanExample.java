package com.universe.bluestone.java22;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Gatherers;

public class GathersScanExample {
    public static void main(String[] args) {
        List<Integer> runningSums = Stream.of(10, 20, 30, 40)
            .gather(Gatherers.scan(() -> 0, Integer::sum))
            .toList();

        // Output: [10, 30, 60, 100]
        System.out.println(runningSums);
    }
}