package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxFlatMapExample {

    // A mock service that returns a Mono<String> representing an order for a given userId
    public static Mono<String> findOrdersByUserId(int userId) {
        // Simulate an asynchronous operation, e.g., a non-blocking database call
        return Mono.just("Order for user " + userId).delayElement(java.time.Duration.ofMillis(100));
    }

    public static void main(String[] args) {
        Flux<Integer> userIds = Flux.just(101, 102, 103);

        userIds.flatMap(userId -> {
            // The mapper function returns a Publisher (Mono<String> in this case)
            return findOrdersByUserId(userId);
        }).subscribe(order -> System.out.println("Received: " + order)); // Subscribing triggers the flow

        //simple example of flatMap with Flux of Lists
        Flux<List<Integer>> userGroups = Flux.just(List.of(101, 102, 103), List.of(201, 202, 203), List.of(301, 302, 303));

        userGroups.flatMap(list -> Flux.fromIterable(list)).subscribe(order -> System.out.println("Received: " + order));
    }
}