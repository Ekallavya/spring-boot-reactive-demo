package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxBufferUntilExample {

    public static void main(String[] args) {
        // Source Flux of integers 1, 2, 3, 4, 5, ...
        // delayElements is used to simulate a continuous, asynchronous stream
        Flux<Integer> integerFlux = Flux.range(1, 100)
                                        .delayElements(Duration.ofMillis(50));

        // Use bufferUntil with a predicate to check for an even number
        integerFlux.bufferUntil(i -> i % 5 == 0)
                   .subscribe(buffer -> System.out.println("Received buffer: " + buffer));

        // Keep the application alive long enough to see the output
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//output
//Received buffer: [1, 2, 3, 4, 5]
//Received buffer: [6, 7, 8, 9, 10]
//Received buffer: [11, 12, 13, 14, 15]
//Received buffer: [16, 17, 18, 19, 20]
//Received buffer: [21, 22, 23, 24, 25]
//Received buffer: [26, 27, 28, 29, 30]
//Received buffer: [31, 32, 33, 34, 35]
//Received buffer: [36, 37, 38, 39, 40]
//Received buffer: [41, 42, 43, 44, 45]
//Received buffer: [46, 47, 48, 49, 50]
//Received buffer: [51, 52, 53, 54, 55]
//Received buffer: [56, 57, 58, 59, 60]
//Received buffer: [61, 62, 63, 64, 65]
//Received buffer: [66, 67, 68, 69, 70]
//Received buffer: [71, 72, 73, 74, 75]
//Received buffer: [76, 77, 78, 79, 80]
//Received buffer: [81, 82, 83, 84, 85]
//Received buffer: [86, 87, 88, 89, 90]
//Received buffer: [91, 92, 93, 94, 95]