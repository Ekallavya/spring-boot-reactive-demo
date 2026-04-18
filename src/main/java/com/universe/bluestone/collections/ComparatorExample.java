package com.universe.bluestone.collections;
/**
A comparator object is capable of comparing two different objects.
Comparators can be passed to a sort method (such as Collections.sort) to allow precise control over 
the sort order. Comparators can also be used to control the order of certain data structures (such as TreeSet or TreeMap).
*/


import java.util.*;

class Person{
    int age;    
    String name;

    public void setAge(int age){
        this.age=age;    
    }
    public int getAge(){
        return this.age;    
    }
    public void setName(String name){
        this.name=name;    
    }
    public String getName(){    
        return this.name;    
    }
}
 class AgeComparator implements Comparator{

    public int compare(Object ob1, Object ob2){
        int ob1Age = ((Person)ob1).getAge();        
        int ob2Age = ((Person)ob2).getAge();

        if(ob1Age > ob2Age)
            return 1;
        else if(ob1Age < ob2Age)
            return -1;
        else
            return 0;    
    }
 }
  public class ComparatorExample{
        public static void main(String args[]){
         Person person[] = new Person[3];

         person[0] = new Person();
         person[0].setAge(35);
         person[0].setName("A");

         person[1] = new Person();
         person[1].setAge(30);
         person[1].setName("B");

         person[2] = new Person();
         person[2].setAge(32);
         person[2].setName("C");

         System.out.println("Order of person before sorting is");
         for(int i=0; i < person.length; i++){
             System.out.println( person[i].getName() + "\t" + person[i].getAge());
         }

         Arrays.sort(person, new AgeComparator());
         System.out.println("\n\nOrder of person after sorting by person age is");

         for(int i=0; i < person.length; i++){
             System.out.println( person[i].getName() + "\t" + person[i].getAge());
         }
        }
     }
