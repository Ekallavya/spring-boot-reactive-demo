package com.universe.bluestone.collections;

import java.util.*;

class Employ implements Comparable{
    int age;

    public void setAge(int age){    
        this.age=age;
    }
    public int getAge(){    
        return this.age;    
    }

    public int compareTo(Object ob){
        if(!(ob instanceof Employ)){
            throw new ClassCastException("Invalid object");
        }

        int age = ((Employ) ob).getAge();

        if(this.getAge() > age)    
            return 1;
        else if ( this.getAge() < age )
            return -1;
        else
            return 0;

    }
 }

public class ComparableExample{

    public static void main(String args[]){

        Employ one = new Employ();        
        one.setAge(35);

        Employ two = new Employ();        
        one.setAge(30);
        
        Employ three = new Employ();        
        one.setAge(40);
        
        List<Employ> empList = new ArrayList<Employ>();
        
        empList.add(one);
        empList.add(two);
        empList.add(three);
        
        if(one.compareTo(two) > 0) {        
            System.out.println("Employ one is elder than Employ two!");

        } else if(one.compareTo(two) < 0) {        
            System.out.println("Employ one is younger than Employ two!");        

        } else if(one.compareTo(two) == 0) {        
            System.out.println("Both Employs are same!");        
        }
        
        Collections.sort(empList);
    }
 }