package com.universe.bluestone.designpatterns;

/*
 * Factory pattern is one of most used design pattern in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}
}

class ShapeFactory {

	//use getShape method to get object of type shape 
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();

		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();

		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}

		return null;
	}
}

interface Shape {
	public void draw();
}

class Rectangle implements Shape {

	
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}


class Square implements Shape {

	
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}


class Circle implements Shape {

	
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}