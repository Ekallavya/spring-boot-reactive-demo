package com.universe.bluestone.java8;

import java.util.Arrays;

public class ArraysParallelSortExample {
    public static void main(String[] args) {
        // 1. Initialize an unsorted array
        int[] numbers = {45, 12, 85, 32, 4, 67, 23, 9};
        
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        
        // 2. Perform parallel sorting
        Arrays.parallelSort(numbers);
        
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}