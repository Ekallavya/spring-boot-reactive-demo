package com.universe.bluestone.designpatterns;
/**
 * 
 * Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. 
 * This type of design pattern comes under structural pattern as this pattern decouples 
 * implementation class and abstract class by providing a bridge structure between them.
 * This pattern involves an interface which acts as a bridge which makes the 
 * functionality of concrete classes independent from interface implementer classes. 
 * Both types of classes can be altered structurally without affecting each other
 *
 */
public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape1 redCircle = new Circle1(100,100, 10, new RedCircle());
      Shape1 greenCircle = new Circle1(100,100, 10, new GreenCircle());

      redCircle.draw();
      greenCircle.draw();
   }
}

interface DrawAPI {
	   public void drawCircle(int radius, int x, int y);
	}
class RedCircle implements DrawAPI {
	  
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}
class GreenCircle implements DrawAPI {
	  
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}
abstract class Shape1 {
	   protected DrawAPI drawAPI;
	   
	   protected Shape1(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
	}


class Circle1 extends Shape1 {
	   private int x, y, radius;

	   public Circle1(int x, int y, int radius, DrawAPI drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      drawAPI.drawCircle(radius,x,y);
	   }
	}