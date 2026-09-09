package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxTakeWhileDemo {
    public static void main(String[] args) throws InterruptedException {
        Flux<Integer> flux1 = Flux.range(100,200);

        flux1.takeWhile(i -> i <115).subscribe(System.out::println);

        Thread.sleep(100000);
    }
}
//output
//100
//101
//102
//103
//104
//105
//106
//107
//108
//109
//110
//111
//112
//113
//114