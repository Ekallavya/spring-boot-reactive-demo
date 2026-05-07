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
            new Book("Author A", 15.0)
        );

        // Sorting using streams and chained comparators
        List<Book> sortedBooks = books.stream()
            .sorted(Comparator.comparing(Book::getAuthor)
                              .thenComparing(Book::getPrice))
            .toList();

        System.out.println("Sorted Books:");
        sortedBooks.forEach(System.out::println);
    }
}