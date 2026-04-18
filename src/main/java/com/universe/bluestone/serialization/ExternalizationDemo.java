package com.universe.bluestone.serialization;
import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class User implements Externalizable {
	private String userName;
	private int age;
	
	public User(){}
	
	public User(String userName,int age){
		this.userName= userName;
		this.age=age;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
		userName=(String) in.readObject();
		age=in.readInt();
		System.out.println("Object Reading");
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(userName);
		out.writeInt(age);
		System.out.println("Object writing");
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class ExternalizationDemo {
   public static void main(String... args) throws Exception, IOException{
	   
	   File f= new File("E:/tmp/user.ser");
	   User u= new User("Atul",20);
	   
	   ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));  
       out.writeObject(u);  
       out.close();// if not closed , turns memory leak
       
       ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
       u=(User)in.readObject();
       
       in.close();
       
       System.out.println("After  de externalizing user name: " +u.getUserName()+" and age is:"+u.getAge());   
   }
}