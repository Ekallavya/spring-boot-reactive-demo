package com.universe.bluestone.basicoops;

/*
 * Nested classes in java can be defined as classes within the class. i.e A class can be a member of another class
If nested class is declared as static, then that nested class is called as static nested class.
Static nested classes can contain both static and non-static members
We can access only static members of outer class inside a static nested class. We can�t access non-static members of outer class inside a static nested class.
We have seen that static methods can�t be abstract but static nested classes can be abstract
Static nested class can be final.
Static Nested Classes can be chained. i.e Nested class may contain another nested class and that nested class may contain another nested class and so on.
*/

class OuterClass
{
	static int j;  //static field of OuterClass
	int i=10;         //Non-static field of OuterClass
 
    static void methodOne()
    {
        System.out.println("Static method of OuterClass");
    }
    
    final static class NestedClass
    {
        void methodOne()
        {
            //concrete method of NestedClass
        }
    }
    abstract static class AbstractNestedClass
    {
        abstract void methodOne();  //abstract method of NestedClass
 
        void methodTwo()
        {
            //concrete method of NestedClass
        }
    }
 
    static class NestedClassOne
    {
        int i = 20;   //Non-static Field of NestedClassOne
 
        static void methodOne()
        {
            System.out.println("Static method of NestedClassOne");
        }
    }
 
    static class NestedClassTwo
    {
        int i = 30;    //Non-static Field of NestedClassTwo
 
        static void methodOne()
        {
        	class LocalInnerClassThree
            {
                //Class defined inside a method
            }
        	System.out.println("static method of NestedClassTwo");
        }
    }
    
    static class A
    {
        static class B
        {
            static class C
            {
                static class D
                {
                    static void methodOne()
                    {
                        System.out.println("Chain Of Nested Classes");
                    }
                }
            }
        }
    }
}
public class StaticNestedClassTest
{
    public static void main(String[] args)
    {
        OuterClass.methodOne();      //static member can be accessed directly through class name.
        OuterClass outer = new OuterClass();
        System.out.println(outer.i);  //Instance member must be accessed through object reference
 
        OuterClass.NestedClassOne.methodOne();  //static member can be accessed directly through class name.
        OuterClass.NestedClassOne nestedOne = new OuterClass.NestedClassOne();
        System.out.println(nestedOne.i);     //Instance member must be accessed through object reference
 
        OuterClass.NestedClassTwo.methodOne();  //static member can be accessed directly through class name.
        OuterClass.NestedClassTwo nestedTwo = new OuterClass.NestedClassTwo();
        System.out.println(nestedTwo.i);     //Instance member must be accessed through object reference
    }
}
