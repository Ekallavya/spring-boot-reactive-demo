package com.universe.bluestone.java8;

import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulatorExample {
    public static void main(String[] args) {
        // Track the maximum value; start with Long.MIN_VALUE as the identity
        LongAccumulator maxAccumulator = new LongAccumulator(Long::max, Long.MIN_VALUE);

        maxAccumulator.accumulate(10L);
        maxAccumulator.accumulate(42L);
        maxAccumulator.accumulate(5L);

        System.out.println("Current Max: " + maxAccumulator.get()); // Prints 42
    }
}