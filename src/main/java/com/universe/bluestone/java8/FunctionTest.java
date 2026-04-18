package com.universe.bluestone.java8;
import java.util.*;
import java.util.function.*;

/*The Function interface has only one single method apply(). 
It can accept an object of any data type and returns a result of any datatype.*/

public class FunctionTest {
   public static void main(String args[]) {
      String[] countries = {"India", "Australia", "England", "SouthAfrica", "Srilanka", "Newzealand", "WestIndies", "Scotland"};
      Function<String[], StringJoiner> converter = (strArr) -> {  // lambda expression
         StringJoiner names = new StringJoiner("_","(",")");
         for(String str : strArr) {
        	 names.add(str);
         }
         return names;
      };
      System.out.println("==================");
      System.out.println(converter.apply(countries));
   }
}