package com.universe.bluestone.javastreams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTeeingDemo {
    public static void main(String[] args) {
       Long average= Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingInt(Integer::intValue),
                        (count, sum) -> sum/count
                ));

        System.out.println("average :"+average);
    }
}
