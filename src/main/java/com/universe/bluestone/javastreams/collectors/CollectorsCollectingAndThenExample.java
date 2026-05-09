package com.universe.bluestone.javastreams.collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
// Java program to reverse a list using `Collectors.collectingAndThen()` method
class CollectorsCollectingAndThenExample
{
    public static void main(String[] args)
    {
        List<String> countries = Arrays.asList("USA", "UK", "India");
        System.out.println(countries);
        List<String> l1 = countries.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                                                    l -> {
                                                    	return l.stream().map(s->s.concat("_"+s.toLowerCase())).collect(Collectors.toCollection(ArrayList::new)).stream();

                                                    }
                )).collect(Collectors.toList());
        
        System.out.println(l1);
    }
}
