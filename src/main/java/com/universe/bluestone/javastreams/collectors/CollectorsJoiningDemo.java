package com.universe.bluestone.javastreams.collectors;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
  
public class CollectorsJoiningDemo {
    public static void main(String[] args)
    {
        // Create a character list
        List<String> strList = Arrays.asList("Geeks", "for", "Geeks");
  
        // Convert the character list into String
        // using Collectors.joining() method
        String chString = strList.stream()
                              //.map(String::valueOf)
                              .collect(Collectors.joining());
        						//.collect(Collectors.joining(",","[","]"));
        // Print the concatenated String
        System.out.println(chString);
        
        List<String> str = Arrays.asList("1", "2", "3","4","5","6","7","8","9");
        
        // Convert the character list into String
        // using Collectors.joining() method
        String numsString = str.stream()
                              .map(String::valueOf)
                              .collect(Collectors.joining());
        						//.collect(Collectors.joining(",","[","]"));
        // Print the concatenated String
        System.out.println(numsString);
    }
}