package com.universe.bluestone.java8;

public enum Week{A,B,C,D,E,F,K};

class Test{
	public static void main(String args[]){
		
		Week temp=Week.D;
		//Week India =Week.valueOf("I");
		if(temp==Week.A){
			System.out.println("America");
		}
		
		
		switch(temp){
		
		case A :System.out.println("America");
		case B :System.out.println("BreZil");
		case C :System.out.println("Canada");
		case D :System.out.println("Denmark");
		case E :System.out.println("England");
		case F :System.out.println("France");
		
		default:
		System.out.println("India");
		System.out.println("position: "+temp.ordinal());
		
		}
		
		
		
		
		
	}
}
