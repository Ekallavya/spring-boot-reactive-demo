package com.universe.bluestone.files;

import java.io.*;  
class ByteArrayOutputStreamTest{  
 public static void main(String args[])throws Exception{  
  FileOutputStream fout1=new FileOutputStream("D:/tmp/f1.txt");  
  FileOutputStream fout2=new FileOutputStream("D:/tmp/f2.txt");  
  
  ByteArrayOutputStream bout=new ByteArrayOutputStream();  
  bout.write(139); 
  bout.write(140);
  bout.write(141);
  
  bout.writeTo(fout1);  
  bout.writeTo(fout2);  
  
  bout.flush();  
  bout.close();//has no effect  
  System.out.println("success...");  
 }  
} 