package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxRepeatExample {

    public static void main(String[] args) {
        Flux.range(1, 3) // Emits 1, 2, 3
            .doOnNext(i -> System.out.println("Emitted :: " + i))
            .repeat(1) // Repeats the sequence 1 additional time
            .subscribe(i -> System.out.println("Received :: " + i));
    }
}

// Output:
//Emitted :: 1
//Received :: 1
//Emitted :: 2
//Received :: 2
//Emitted :: 3
//Received :: 3
//Emitted :: 1
//Received :: 1
//Emitted :: 2
//Received :: 2
//Emitted :: 3
//Received :: 3