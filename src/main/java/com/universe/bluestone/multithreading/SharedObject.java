package com.universe.bluestone.multithreading;

public class SharedObject {
	
	public static int counter = 0;
	
	public static synchronized int getCounter(){
		return ++counter; 
	}

}
