package com.universe.bluestone.javastreams.collectors;

// Java code to demonstrate Collectors
// toCollection(Supplier collectionFactory) method
  
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
  
class CollectorsToCollectionDemo {
  
    // Driver code
    public static void main(String[] args){
  
        // Creating a string stream
        Stream<String> s = Stream.of("Geeks", "for", "GeeksClasses");
  
        // Using toCollection() method
        // to create a collection
        Collection<String> names = s.collect(Collectors.toCollection(TreeSet::new));
  
        // Printing the elements
        System.out.println(names);
    }
}