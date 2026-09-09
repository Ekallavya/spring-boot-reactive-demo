package com.universe.bluestone.java21;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedListExample {
    public static void main(String[] args) {
        SequencedCollection<String> list = new ArrayList<>();
        
        // Adding elements at ends
        list.addLast("Silver");
        list.addFirst("Gold");
        list.addLast("Bronze"); // Order: [Gold, Silver, Bronze]

        // Fetching elements cleanly without list.get(0) or list.get(list.size() - 1)
        System.out.println("First: " + list.getFirst()); // Gold
        System.out.println("Last: " + list.getLast());   // Bronze

        // Reversing the view (Modifications to the view affect the underlying collection)
        SequencedCollection<String> reversedView = list.reversed();
        System.out.println("Reversed: " + reversedView); // [Bronze, Silver, Gold]

        // Removing elements
        list.removeFirst();
        System.out.println("After removing first: " + list); // [Silver, Bronze]
    }
}