package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Collection;
import java.util.Map;

public class FluxCollectMultimapExample {

    public static void main(String[] args) {
        // A Flux of data entries
        Flux<String> flux = Flux.just(
                "Site_0:bezkoder.com",
                "Description_1:Project Reactor",
                "Description_0:Java Technology",
                "Site_1:example.com"
        );

        // Use collectMultimap to group items by type (e.g., "Site" or "Description")
        Mono<Map<String, Collection<String>>> multiMapMono = flux.collectMultimap(
                item -> item.split("_[0-9]+:")[0], // Key Extractor: "Site_0:..." -> "Site"
                item -> item.split(":")[1]          // Value Extractor: "...:bezkoder.com" -> "bezkoder.com"
        );

        // Block to get the result for demonstration (in a non-reactive context)
        Map<String, Collection<String>> resultMap = multiMapMono.block();

        // Print the resulting map
        if (resultMap != null) {
            resultMap.forEach((key, value) ->
                System.out.println(key + " -> " + value)
            );
        }
    }
}
//output:
//Site -> [bezkoder.com, example.com]
//Description -> [Project Reactor, Java Technology]