package com.universe.bluestone.basicoops;

import java.util.Random;

public class PolymorphismTest {

	public static void main(String[] args) {
		 int leftLimit = 97; // letter 'a'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 10;
		    Random random = new Random();

		    String generatedString = random.ints(leftLimit, rightLimit + 1)
		      .limit(targetStringLength)
		      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		      .toString();

		    System.out.println(generatedString);
		System.out.println("Done");
	}

}

class Base{
	public static void hello(){}
}
class Derived extends Base{
	public static void hello(){}
	//if static modifier removed  at super or sub level we will get the below compile err
	//This static method cannot hide the instance method from Base
	//This instance method cannot override the static method from Base
}