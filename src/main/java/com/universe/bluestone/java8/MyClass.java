package com.universe.bluestone.java8;
public class MyClass implements FunctionalInterface1, FunctionalInterface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	//MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		FunctionalInterface1.print("abc");
		//FunctionalInterface1.super.log("abc");
	}
	
}