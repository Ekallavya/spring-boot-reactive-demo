package com.universe.bluestone.java12;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTeeingExample {
    public static void main(String[] args)
    {
        double mean
            = Stream.of(2, 3, 4, 5, 6)
                  .collect(Collectors.teeing(
                      Collectors.summingDouble(i -> i), Collectors.counting(),
                      (sum, n) -> sum / n));

        System.out.println(mean);
    }
}