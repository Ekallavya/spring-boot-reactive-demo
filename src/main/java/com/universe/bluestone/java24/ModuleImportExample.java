package com.universe.bluestone.java24;

import module java.base;

public class ModuleImportExample {
    public static void main(String[] args) {
        // List, Map (from java.util) and Stream (from java.util.stream) 
        // are accessible directly because of the module import above.
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Avocado");
        
        Map<Character, List<String>> grouped = fruits.stream()
            .collect(Collectors.groupingBy(s -> s.charAt(0)));
            
        System.out.println(grouped);
    }
}