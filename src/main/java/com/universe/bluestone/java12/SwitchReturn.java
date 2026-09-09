package com.universe.bluestone.java12;

public class SwitchReturn {

      // returns mealNumber
    static int getMealNumber(String meal)
    {

        // stores mealNumber using
        // new switch expression
        int mealNumber = switch (meal)
        {

           case "SOUP" -> 1;

           case "BURGER", "CHIPS", "SANDWICH" -> 2;

           case "SPAGHETTI", "MACARONI" -> 3;
            
           default -> throw new RuntimeException("Invalid meal: " + meal);
        };

        return mealNumber;
    }
  
    public static void main(String[] args)
    {

        // define meal
        String meal = "BURGER";

        // print mealNumber
        System.out.println("The mealNumber is : "
                           + getMealNumber(meal));
    }
}