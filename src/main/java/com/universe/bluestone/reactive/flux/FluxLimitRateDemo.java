package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxLimitRateDemo {
    public static void main(String[] args) {
            // This is a placeholder for the actual implementation of Flux.limitRate
            // Since limitRate is a method that controls the rate of request to the upstream,
            // we would typically use it in a scenario where we have a Flux that emits items and we want to limit the rate at which we consume them.

            // For example:
             Flux.range(1, 100)
                 .limitRate(10) // Limit the rate to 10 items at a time
                 .subscribe(System.out::println);

            System.out.println("Flux.limitRate is used to control the rate of request to the upstream. It allows you to specify how many items to request at a time.");
    }
}
