package com.universe.bluestone.java21;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        
        map.put(2, "Two");
        map.put(3, "Three");
        
        // Direct insertion at boundaries
        map.putFirst(1, "One");
        map.putLast(4, "Four"); // Order: {1=One, 2=Two, 3=Three, 4=Four}

        System.out.println("First Entry: " + map.firstEntry()); // 1=One
        System.out.println("Last Key: " + map.sequencedKeySet().getLast()); // 4

        // Structural Reverse View
        SequencedMap<Integer, String> reversedMap = map.reversed();
        System.out.println("Reversed Map: " + reversedMap); // {4=Four, 3=Three, 2=Two, 1=One}
        
        // Destructive polling
        map.pollFirstEntry(); 
        System.out.println("After polling first: " + map); // {2=Two, 3=Three, 4=Four}
    }
}