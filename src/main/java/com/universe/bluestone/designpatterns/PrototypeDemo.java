package com.universe.bluestone.designpatterns;

import java.io.Serializable;

/**
 * 
 * Prototype pattern refers to creating duplicate object while keeping performance in mind. 
 * This type of design pattern comes under creational pattern 
 * as this pattern provides one of the best ways to create an object.
 * This pattern involves implementing a prototype interface which tells to create a clone of the current object. 
 * This pattern is used when creation of object directly is costly. For example, 
 * an object is to be created after a costly database operation. We can cache the object,
 * returns its clone on next request and update the database as and when needed thus reducing database calls.
 *
 */

class CriticalObject implements Serializable,Cloneable{

	private static final long serialVersionUID = -2479938662780585577L;

	public void  doStuff(){
		System.err.println("action done");
	}
	
	public Object getClone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		CriticalObject original = new CriticalObject();
		
		CriticalObject duplicate = (CriticalObject)original.getClone();
		
		duplicate.doStuff();
		
	}

}
