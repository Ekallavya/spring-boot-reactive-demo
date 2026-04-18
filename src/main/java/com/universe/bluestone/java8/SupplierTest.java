package com.universe.bluestone.java8;
import java.util.*;
import java.util.function.*;

/*A Supplier interface has only one single method called get(). 
It does not accept any arguments and returns an object of any data type.*/

public class SupplierTest {
   private static void printNames(Supplier<String> arg) {
      System.out.println(arg.get());
   }
   private static void listBeginWith(List<String> list, Predicate<String> valid) {
      printNames(() -> "\nList of countries:");
      list.forEach(country -> {     // lambda expression
         if(valid.test(country)) {
            printNames(() -> country);
         }
      });
   }
   public static void main(String[] args) {
      String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies"};
      List<String> countryList = Arrays.asList(countries);
      listBeginWith(countryList, (s) -> s.startsWith("I"));
      listBeginWith(countryList, (s) -> s.contains("I"));
      listBeginWith(countryList, (s) -> s.endsWith("ia"));
   }
}