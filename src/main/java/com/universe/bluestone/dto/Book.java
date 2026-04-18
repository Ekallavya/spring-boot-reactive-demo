package com.universe.bluestone.dto;

public class Book {
    private String author;
    private double price;

    // Constructor, getters, setters, and toString() omitted for brevity

    public Book(String author, double price) {
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{author='" + author + "', price=" + price + '}';
    }
}