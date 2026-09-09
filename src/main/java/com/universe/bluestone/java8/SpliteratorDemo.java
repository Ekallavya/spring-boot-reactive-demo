package com.universe.bluestone.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        List<String> frameworkList = new ArrayList<>(List.of("Spring", "Hibernate", "Quarkus", "Micronaut"));

        // 1. Obtain the Spliterator
        Spliterator<String> firstHalf = frameworkList.spliterator();

        // 2. Attempt to partition the data
        // This splits the original 4-element list into two 2-element Spliterators
        Spliterator<String> secondHalf = firstHalf.trySplit();

        System.out.println("--- Processing First Half ---");
        // tryAdvance returns false when elements run out
        while (firstHalf.tryAdvance(element -> System.out.println("First part: " + element)));

        System.out.println("--- Processing Second Half ---");
        if (secondHalf != null) {
            // Alternatively, consume all remaining elements sequentially in one go
            secondHalf.forEachRemaining(element -> System.out.println("Second part: " + element));
        }
    }
}