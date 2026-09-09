package com.universe.bluestone.java21;

// Define a simple record
record Point(int x, int y) {}

public class RecordPatternDemo {
    public static void printDetails(Object obj) {
        // Java 21 Record Pattern matching
        if (obj instanceof Point(int x, int y)) {
            // x and y are extracted automatically as local variables
            System.out.println("X coordinate: " + x);
            System.out.println("Y coordinate: " + y);
        }
    }
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        printDetails(point);
    }
}