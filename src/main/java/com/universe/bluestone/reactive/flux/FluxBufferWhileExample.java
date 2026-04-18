package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.util.List;

public class FluxBufferWhileExample {

    public static void main(String[] args) {
        // A sequence of integers
        Flux<Integer> flux = Flux.just(1, 3, 5, 2, 4, 6, 11, 12, 13);

        // Use bufferWhile to group consecutive even numbers
        Flux<List<Integer>> bufferedFlux = flux.bufferWhile(i -> i % 2 == 0);

        // Subscribe to the resulting Flux<List<Integer>> and print the buffers
        bufferedFlux.subscribe(buffer ->
            System.out.println("New buffer emitted: " + buffer)
        );
    }
}
//output:
//New buffer emitted: [2, 4, 6]
//New buffer emitted: [12]

