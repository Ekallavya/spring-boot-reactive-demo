package com.universe.bluestone.java21;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SequencedSetExample {
    public static void main(String[] args) {
        SequencedSet<String> set = new LinkedHashSet<>();
        set.add("B");
        set.add("C");
        
        set.addFirst("A"); // [A, B, C]
        set.addLast("D");  // [A, B, C, D]

        // Special behavior: Moving an existing element to the front
        set.addFirst("C"); // Moves 'C' to the front! 
        
        System.out.println(set); // Output: [C, A, B, D]
        System.out.println(set.reversed()); // Output: [D, B, A, C]
    }
}