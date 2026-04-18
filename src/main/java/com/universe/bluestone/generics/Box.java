package com.universe.bluestone.generics;
/**
 * Generics provide compile-time type safety that allows programmers to catch invalid types at compile time and removing risk of ClassCastException.
 * 
Java Generic Type Naming convention helps us understanding code easily and having a naming convention is one of the best practices of java programming language. So generics also comes with it�s own naming conventions. Usually type parameter names are single, uppercase letters to make it easily distinguishable from java variables. The most commonly used type parameter names are:

E � Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
K � Key (Used in Map)
N � Number
T � Type
V � Value (Used in Map)
S,U,V etc. � 2nd, 3rd, 4th types

*/

public class Box<T> {

  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public static void main(String[] args) {
     Box<Integer> integerBox = new Box<Integer>();
     Box<String> stringBox = new Box<String>();
    
     integerBox.add(new Integer(10));
     stringBox.add(new String("Hello World"));

     System.out.printf("Integer Value :%d\n\n", integerBox.get());
     System.out.printf("String Value :%s\n", stringBox.get());
  }
}