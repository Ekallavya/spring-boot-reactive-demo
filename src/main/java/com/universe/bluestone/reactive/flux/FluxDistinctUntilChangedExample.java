package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.Arrays;
import java.util.List;

public class FluxDistinctUntilChangedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 2, 1, 1);

        Flux.fromIterable(numbers)
            .distinctUntilChanged()
            .subscribe(System.out::println);
    }
}
//output
//1
//2
//3
//2
//1