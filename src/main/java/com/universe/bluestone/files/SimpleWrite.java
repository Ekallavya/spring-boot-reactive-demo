package com.universe.bluestone.files;

import java.io.FileOutputStream;

public class SimpleWrite{  
  public static void main(String args[]){  
   try{  
     FileOutputStream fout=new FileOutputStream("D:/tmp/abc.txt");  
     String s="Sachin Tendulkar is my favourite player";  
     byte b[]=s.getBytes();//converting string into byte array  
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
    }catch(Exception e){System.out.println(e);}  
  }  
} 