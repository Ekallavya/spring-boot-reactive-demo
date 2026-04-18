package com.universe.bluestone.javastreams.optional;

import java.util.Optional;

public class MapDemo {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Txn Successfully completed.");
        optional.map(String::toUpperCase).ifPresent(System.out::println);
    }
}
