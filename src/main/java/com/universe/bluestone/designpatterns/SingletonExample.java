package com.universe.bluestone.designpatterns;

import java.io.Serializable;

public final class SingletonExample implements Cloneable,Serializable{

	private static final long serialVersionUID = -6165022056600648589L;
	private static volatile SingletonExample singletonInstance;
	private SingletonExample() {
	}
	public static  SingletonExample getSingletonInstance() {
		if (null == singletonInstance) {
			synchronized (SingletonExample.class){
				if (null == singletonInstance) {
					singletonInstance = new SingletonExample();
				}
			}
		}
		return singletonInstance;
	}
	public void printSingleton(){
		System.out.println("Inside print Singleton");
	}


	public Object clone() throws CloneNotSupportedException {  
		// throw CloneNotSupportedException if someone tries to clone the singleton object 
		// return singletonInstance.clone();
		throw new CloneNotSupportedException();  
	}  

	private Object readResolve()
	{
		return getSingletonInstance();
	}
}