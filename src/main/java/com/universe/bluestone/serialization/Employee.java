package com.universe.bluestone.serialization;

import java.util.Objects;

public class Employee extends Thread implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private transient int SSN;
	private int number;



	/*public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}*/



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getSSN() {
		return SSN;
	}



	public void setSSN(int sSN) {
		SSN = sSN;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public void mailCheck()
	{
		System.out.println("Mailing a check to " + name + " " + address);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Employee employee)) return false;
        return SSN == employee.SSN && number == employee.number && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name, address, SSN, number);
	}
}