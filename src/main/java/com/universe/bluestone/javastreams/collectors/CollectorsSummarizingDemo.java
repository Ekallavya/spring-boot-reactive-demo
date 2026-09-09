package com.universe.bluestone.javastreams.collectors;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class CollectorsSummarizingDemo {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = Stream.of(
            new Product("Product 1", 100.0),
            new Product("Product 2", 120.0),
            new Product("Product 3", 50.5)
        ).collect(Collectors.summarizingDouble(Product::getPrice));

        System.out.println(stats);
    }
}