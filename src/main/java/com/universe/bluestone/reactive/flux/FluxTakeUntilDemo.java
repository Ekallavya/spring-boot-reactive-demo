package com.universe.bluestone.reactive.flux;

public class FluxTakeUntilDemo {
    public static void main(String[] args) {
            FluxIntegerGenerator generator = new FluxIntegerGenerator();
            generator.generateIntegers()
                    .takeUntil(i -> i > 105) // Take values until the condition is met
                    .subscribe(System.out::println);
    }
}
