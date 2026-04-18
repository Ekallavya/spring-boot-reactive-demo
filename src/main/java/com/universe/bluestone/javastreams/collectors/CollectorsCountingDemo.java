package com.universe.bluestone.javastreams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;
  
public class CollectorsCountingDemo {
  
    // Driver code
    public static void main(String[] args)
    {
        // creating a stream of strings
        Stream<String> s = Stream.of("1", "2", "3", "4");
  
        // using Collectors counting() method to
        // count the number of input elements
        long ans = s.collect(Collectors.counting());
  
        // displaying the required count
        System.out.println(ans);
        Stream<String> p = Stream.of("1", "2", "3", "4");
        System.out.println(p.count());
    }
}