package com.universe.bluestone.javastreams;

import java.util.List;

public class StreamsDropWhile$TakeWhile {

    public static void main(String[] args) {
        List<Integer>  integerList = List.of(1, 3, 7, 4, 6,5, 10, 8, 9, 2);

        integerList.stream().dropWhile(n -> n < 5).forEach(System.out::println);
        System.out.println("-----------------------------");
        integerList.stream().takeWhile(n -> n < 5).forEach(System.out::println);
    }
}
