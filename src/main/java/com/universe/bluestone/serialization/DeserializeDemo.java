package com.universe.bluestone.serialization;
import java.io.*;
public class DeserializeDemo
{
	public static void main(String [] args)
	{
		Employee e = null;
		try
		{
			FileInputStream fileIn = new FileInputStream("E:/tmp/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			int bytes = in.available();
			System.out.println(bytes);
			while(true){
				try {
					e = (Employee) in.readObject();
				} catch (EOFException e1) {
					break;
				}
				if(e!=null){
					System.out.println("Deserialized Employee...");
					System.out.println("Name: " + e.getName());
					System.out.println("Address: " + e.getAddress());
					System.out.println("SSN: " + e.getSSN());
					System.out.println("Number: " + e.getNumber()); 
				}
			}
			in.close();
			fileIn.close();
		}catch(IOException i)
		{
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c)
		{
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		
		System.out.println("program end");

	}
}