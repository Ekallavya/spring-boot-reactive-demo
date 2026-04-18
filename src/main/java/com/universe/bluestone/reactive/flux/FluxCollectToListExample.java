package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class FluxCollectToListExample {
    public static void main(String[] args) {
        List<Integer> tempList = new ArrayList<>();
        tempList.add(0);
        tempList.add(1);
        tempList.add(2);
        tempList.add(3);

        Flux<Integer> numbers = Flux.range(100, 5);
        Flux<Integer> numbers1 = Flux.range(200, 5);

        // Collect the emitted items into a List
        Mono<List<Integer>> listMono = numbers.collectList();

        // Subscribe to the Mono and print the collected List
        listMono.subscribe(list -> System.out.println("Collected List: " + list));
        listMono.subscribe(tempList::addAll);
        System.out.println("Temp List: " + tempList);
    }
}
