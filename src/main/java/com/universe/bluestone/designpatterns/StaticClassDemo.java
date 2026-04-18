package com.universe.bluestone.designpatterns;

public class StaticClassDemo {

	public static void main(String[] args) {
		
		System.out.println(Utils.square(10));
		System.out.println(Utils.cube(10));
	}

}

final class Utils{
	private Utils(){
		
	}
	
	public static Long  square(long a){
		
		return a*a;
	}
	
	public static Long  cube(long a){
		
		return a*a*a;
	}
}
