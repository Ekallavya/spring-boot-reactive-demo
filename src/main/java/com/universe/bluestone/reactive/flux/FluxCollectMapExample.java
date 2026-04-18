package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Map;
import java.util.function.Function;

public class FluxCollectMapExample {

    public static void main(String[] args) {
        // A source Flux of integers
        Flux<Integer> integerFlux = Flux.just(11, 22, 33, 34);

        // Define key and value extractors
        // Key: the tens digit (i / 10)
        // Value: the units digit (i % 10)
        Function<Integer, Integer> keyExtractor = i -> i / 10;
        Function<Integer, Integer> valueExtractor = i -> i % 10;

        // Apply collectMap to the Flux
        Mono<Map<Integer, Integer>> monoMap = integerFlux.collectMap(keyExtractor, valueExtractor);

        // Subscribe to the resulting Mono to process the final Map
        monoMap.subscribe(map -> {
            System.out.println("Collected Map: " + map);
            // Example output: Collected Map: {2=2, 3=4, 1=1}
        });
        
        // Note on duplicate keys: 
        // For the input [11, 22, 33, 34], both 33 and 34 map to the key '3'.
        // In a standard Map, the last value (34's unit digit, which is 4)
        // replaces the previous one (33's unit digit, which is 3).
        // The resulting map will contain {1=1, 2=2, 3=4}.
    }
}