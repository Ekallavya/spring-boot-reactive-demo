package com.universe.bluestone.reactive.flux;

public class FluxTakeWhileDemo {
    public static void main(String[] args) {
        FluxIntegerGenerator generator = new FluxIntegerGenerator();
        generator.generateIntegers()
                .takeWhile(i -> i < 105) // Take values while they are less than 105
                .subscribe(System.out::println);
    }
}
