package com.universe.bluestone.basicoops;

/*
Nested classes which are declared as non-static or nested classes which can be accessed only though instantiating it�s outer class are called non-static nested classes. Non-static nested classes are also called as Inner Classes.

They are 3 types of Inner Classes in java.

Member Inner Classes
Local Inner Classes
Anonymous Inner classes

Member Inner Classes are non-static nested classes which are declared as non-static members of outer class.
Member inner classes must contain only non-static members. Static members are not allowed inside member inner classes.
we can declare a static field inside a member inner class if the field is final. And such field must be initialized at the time of declaration only
Member inner class may contain any number of 
InstanceBlock but should not contain any StaticBlock.
We can access both static and non-static members of outer class inside a member inner class.

All members of outer class are accessible inside member inner class and all members of member inner class are accessible inside the outer class irrespective of their visibility

Member inner classes can be abstract or can be final but not both.
Local inner class in java is non-static nested class which is declared inside a method or a block and must be defined inside a method or a block.
Local Inner Classes can�t be static. Because, local inner classes are nothing but local variables and local variables can�t be static.
Local inner classes can�t have static members. Only non-static members are allowed inside local inner classes. But local inner classes can contain static and final field.
To access members of local inner class, you must create an instance of it.

Local inner classes are local to a method or a block in which they are defined. i.e you can�t use local inner classes outside the method or block in which they are defined.
Only final local variables of methods or blocks containing local inner class can be used inside local inner class.
Local inner classes can not be declared with access modifiers. i.e Local inner classes can not be private, protected and public. But they can have private, public, protected and default members in them.
Local inner classes can be abstract or can be final but not both

Anonymous inner class, the name itself suggest that it is a class without a name. Anonymous inner class in java is an inner class or non-static nested class without a name

We just have to create an object reference variable of type �SuperClass� and override the method which needs modification in the curly brackets and end with semicolon. No need to create sub class separately. 
*/



class OuterClas
{
    class InnerClas
    {
        int i;     //Non-static field of InnerClass
 
        static final int j = 10;  //static and final field of InnerClass
 
        void methodOne()
        {
            System.out.println("Non-static method of InnerClass");
        }
    }
    
    abstract class InnerClassOne
    {
        //abstract Inner Class
    }
 
    final class InnerClassTwo
    {
    	void test(){
    		final int k =20;
    		//final inner class
    		class LocalInnerClass
    		{
    			int i;     //Non-static field

    			static final int j = 10; //static and final field

    			void methodOne()
    			{
    				System.out.println("From LocalInnerClass");
    			}
    		}

    		System.out.println(LocalInnerClass.j);  //static and final field can be accessed directly through class name

    		LocalInnerClass inner = new LocalInnerClass();  //Creating an object to LocalInnerClass

    		System.out.println(inner.i+k);     //accessing non-static field through object reference

    		inner.methodOne(); 
    	}
    }
}

public class NonStaticNestClassTest {
	
	public static void main(String args[])
    {
        OuterClas outer = new OuterClas();  //creating an instance of OuterClass
 
        OuterClas.InnerClas inner = outer.new InnerClas();  //creating an instance of InnerClass
 
        System.out.println(inner.i);    //accessing non-static field of InnerClass
 
        System.out.println(OuterClas.InnerClas.j);    //static field can be accessed directly through class name
 
        inner.methodOne();     //accessing non-static method of InnerClass
        
        //Anonymous class ,it's  super class can be abstract , concrete , interface
        Runnable r = new Runnable(){ 
        	public void run(){System.out.println("do stuff");}
        };
        
        r.run();
    }

}
