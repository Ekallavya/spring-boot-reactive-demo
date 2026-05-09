package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamComparingThenComparingDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Author B", 25.0),
            new Book("Author A", 20.0),
            new Book("Author B", 30.0),
            new Book("Author A", 15.0),
            new Book("Author C", 10.0),
            new Book("Author C", 40.0)
        );
        //simple sorting
        System.out.println("Sorted Books: by author");
        books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .toList().forEach(System.out::println);
        System.out.println("-----------------------------");
        System.out.println("Sorted Books: by author and then  by price");
        // Sorting using streams and chained comparators
        books.stream()
            .sorted(Comparator.comparing(Book::getAuthor)
                              .thenComparing(Book::getPrice))
            .toList().forEach(System.out::println);
        System.out.println("-----------------------------");
         System.out.println("Sorted Books: by author and then  by price in reverse order");
        // Sorting using streams and chained comparators with reversed order
        books.stream()
            .sorted(Comparator.comparing(Book::getAuthor)
                              .thenComparing(Comparator.comparing(Book::getPrice).reversed()))
            .toList().forEach(System.out::println);

        System.out.println("-----------------------------");

        // Here  second sort will override first sort
        books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .sorted(Comparator.comparing(Book::getPrice))
                .toList().forEach(System.out::println);

    }
}