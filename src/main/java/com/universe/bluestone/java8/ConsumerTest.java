package com.universe.bluestone.java8;
import java.util.*;

/*The Consumer interface has only one single method called accept(). 
It accepts a single argument of any data type 
and does not return any result*/
public class ConsumerTest {
   public static void main(String[] args) {
      String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies","",null};
      System.out.print("The list of countries:\n");
      Arrays.asList(countries).forEach((country) -> System.out.println(country)); // lambda expression
      System.out.print("========================\n");
      Arrays.asList(countries).forEach(x -> System.out.println(x.isBlank())); // lambda expression
   }
}