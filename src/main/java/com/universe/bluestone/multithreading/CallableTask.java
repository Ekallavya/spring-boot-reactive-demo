package com.universe.bluestone.multithreading;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Object>{

	String name;
	
	public CallableTask(String name){
		this.name = name;
	}
	
	public Object call() {
		
		System.out.println("CallableTask:"+SharedObject.getCounter()+":"+name);
		
		return SharedObject.getCounter();
		
	}

}
