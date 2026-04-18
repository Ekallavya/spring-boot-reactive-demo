package com.universe.bluestone.files;

import java.io.*;  
class BufferedStreamTest{  
 public static void main(String args[])throws Exception{  
   FileOutputStream fout=new FileOutputStream("f1.txt");  
   BufferedOutputStream bout=new BufferedOutputStream(fout);  
   String s="Sachin is my favourite player";  
   byte b[]=s.getBytes();  
   bout.write(b);  
  
   bout.flush();  
   bout.close();  
   fout.close();  
   System.out.println("success");  
 }  
}  