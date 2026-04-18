package com.universe.bluestone.java8;
import java.util.*;
import java.util.function.*;

/*The Predicate interface has only one single method test(). 
It return true or false depending on the values of its variables.*/

public class PredicateTest {
   private static List getBeginWith(List<String> list, Predicate<String> valid) {
      List<String> selected = new ArrayList<>();
      list.forEach(country -> {     // lambda expression
         if(valid.test(country)) {
            selected.add(country);
         }
      });
      return selected;
   }
   public static void main(String[] args) {
      String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies"};
      List<String> countryList = Arrays.asList(countries);
         System.out.println(getBeginWith(countryList, (s) -> s.startsWith("A")));
         System.out.println(getBeginWith(countryList, (s) -> s.contains("W")));
         System.out.println(getBeginWith(countryList, (s) -> s.endsWith("nd")));
   }
}