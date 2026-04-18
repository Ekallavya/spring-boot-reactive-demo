package com.universe.bluestone.java8;
import java.util.StringJoiner;  
public class StringJoinerExample {  
    public static void main(String[] args) {  
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
          
        // Adding values to StringJoiner  
        joinNames.add("RaghuPati");  
        joinNames.add("Raghava");  
        joinNames.add("Raja");  
        joinNames.add("Ram");  
                  
        System.out.println(joinNames);  
    }  
} 