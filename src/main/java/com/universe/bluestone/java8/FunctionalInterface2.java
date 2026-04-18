package com.universe.bluestone.java8;
@FunctionalInterface
public interface FunctionalInterface2 {

	void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}