package com.universe.bluestone.javastreams.collectors;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectorsSummingDemo {

    public static void main(String[] args){
        List<Long> longList = Arrays.asList(2343L, 2332L, 876567L);

        System.out.println("Contents of the list - " + longList);

        Stream<Long> longStream = longList.stream();
        //long sumOfElements = longStream.collect(Collectors.summingLong(e -> e));

        long sumOfElements = longStream.mapToLong(e -> e).sum();

        System.out.println("SumAndAvg of the stream - " + sumOfElements);

        System.out.println(longList.stream().mapToLong(x->x.longValue()).sum());
    }
}