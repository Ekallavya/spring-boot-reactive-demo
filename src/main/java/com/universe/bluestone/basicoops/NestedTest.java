package com.universe.bluestone.basicoops;
/**
 * @author 	Madhu
 * @Date 	08-NOV-2012
 */

/**
 * static or non-static nested classes can be declared private,protected,public ,final,abstract
 * 'this' and 'super' can not be used in static context
 * non static fields can not be referred in static context or static nested classes
 * static members can not be declared in non static nested classes
 * static members can only be declared in static nested classes or top level classes
 * not static members can be declared in static nested classes
 * private members of en closing classed can be directly referred in nested classes
 * instance of static nested classes can be exist,without outer(en closing) class object initialization
 * instance of non static nested classes can not be exist,without outer(en closing) class object initialization
 * an interface can be declared inside a class
 * 
 * Declaring an inner class within the body of a method. These classes are known as local classes. 
 * Declaring an inner class within the body of a method without naming the class. These classes are known as anonymous classes.
 * ex: declare interface outside of method and implement inside method without implementation class
 */
public class NestedTest {
	static String mesg = "Hi Madhu welcome to Java world and wish you all the best"; 
	public static void main(String[] args) {
		System.out.println(NestedTest.mesg);
		Outer.C1  obj1 = new Outer.C1();
		obj1.print();
		Outer.C1.println();
		//=======================
		Outer  outer = new Outer();
		Outer.C2 obj2   = outer.new C2();
		obj2.print();
		obj2.println();
		//=======================
		outer.print();
	}

}

class Outer{
	
	static private int 	x = 10;
	private int 		y = 20;
	private int 		z = 30;
	
	// static inner class
	
	static /*private*/ /*protected*/ /*public*/ final class C1{
		private int x =100;
		private static int y =200;
		public void print(){
			System.out.println("C1 - Print :"+this.x);
			System.out.println("C1 - Print :"+Outer.x);
			
		}
		
		static void println(){
			System.out.println("C1 - Println :"+y);
			System.out.println("C1 - Println :"+Outer.x);
		}
	}
	
	/* non static inner class */
	/*private*/ /*protected*/ /*public*/ /*abstract*/ class C2{
		private int x =1000;
		int y =2000;
		
		public void print(){
			System.out.println("C2 - Print :"+this.x);
			System.out.println("C2 - Print :"+Outer.x);
			System.out.println("C2 - Print :"+z);
		}
		
		void println(){
			System.out.println("C2 - Println :"+y);
			System.out.println("C2 - Println :"+Outer.x);
		}
	}
	public interface Inf{
		public void print();
	}
	Inf inf = new Inf(){
		public void print(){
			System.out.println("Inf - Print");
		}
	};
	public void print(){
		System.out.println("outer - Print :"+this.y);
		System.out.println("outer - Print :"+Outer.x);
		System.out.println("outer - Print :"+C1.y);
		C1 c1 = new C1();
		System.out.println("outer - Print :"+c1.x);
		C2 c2 = new C2();
		System.out.println("outer - Print :"+c2.y);

		inf.print();
	}
}

interface Inf1{
	public void print();
}
