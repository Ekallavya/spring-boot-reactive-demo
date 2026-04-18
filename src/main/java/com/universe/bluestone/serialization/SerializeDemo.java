package com.universe.bluestone.serialization;
import java.io.*;

public class SerializeDemo
{
   public static void main(String [] args)
   {
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("E:/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         for(int i =0 ; i <10;i++){
        	 Employee e = new Employee();
             e.setName("Madhu"+i);
             e.setAddress("Hyderabad"+i);
             e.setSSN(i*10);
             e.setNumber(i);
        	 out.writeObject(e);
         }
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}