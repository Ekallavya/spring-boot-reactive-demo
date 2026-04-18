/**
 * 
 */
package com.universe.bluestone.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 *
 */
public class Actor {
	
	private int id;
	private String name;
	private int age;
	private char gender;
	private String country;
	private double remuneration;
	private boolean isActive;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getRemuneration() {
		return remuneration;
	}
	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	private static String getRandomString(int targetStringLength ) {
			 int leftLimit = 97; // letter 'a'
			    int rightLimit = 122; // letter 'z'
			    Random random = new Random();

			    String generatedString = random.ints(leftLimit, rightLimit + 1)
			      .limit(targetStringLength)
			      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			      .toString();

		return generatedString;
	}
	public static List<Actor>  generateActors(int size){
		Random random = new Random();
		ArrayList<Actor> actors = new ArrayList<>(size);
		
		for(int i=0;i<size;i++) {
			Actor actor = new Actor();
			actor.setId(i);
			actor.setName(getRandomString(10));
			actor.setAge(random.nextInt(100));
			actor.setCountry(getRandomString(2).toUpperCase());
			actor.setRemuneration(random.nextDouble());
			actor.setActive(random.nextBoolean());
			actor.setGender(actor.getName().charAt(1)=='F'?'F':'M');
			
			actors.add(actor);
		}
		
		return actors;
		
	}
	@Override
	public String toString() {
		return "Actor [name=" + name + ", age=" + age + ", gender=" + gender + ", country=" + country
				+ ", remuneration=" + remuneration + ", isActive=" + isActive + "]";
	}
	
	

}
