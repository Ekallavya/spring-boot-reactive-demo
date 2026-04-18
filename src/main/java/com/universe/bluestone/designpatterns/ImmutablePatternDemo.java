package com.universe.bluestone.designpatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutablePatternDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person(1001,"Venu","Hyderabad");
		
		System.out.println(p1.getName());
		
		Person p2 = new Person(1002,"Gopal","Chennai");
		
		System.out.println(p2.getName());

	}

}

final class Person{
	private final int age;
	private final String name;
	private final String address;
	private List<String> friends ; 
 	
	
	public Person(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
		
		friends = new ArrayList<String>();
		
		friends.add("Ramesh");
		friends.add("Ganesh");
		friends.add("Suresh");
		
		friends = Collections.unmodifiableList(friends);
		
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public List<String> getFriends() {
		return friends;
	}
	
	
}