package com.universe.bluestone.files;

import java.io.*;  
class SequenceInputStreamTest{  
  public static void main(String args[])throws Exception{  
  
   FileInputStream fin1=new FileInputStream("D:/tmp/Technical.txt");  
   FileInputStream fin2=new FileInputStream("D:/tmp/watsup.txt");  
  
   FileOutputStream fout=new FileOutputStream("D:/tmp/all.txt");  
  
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
   int i;  
   while((i =sis.read())!=-1)  
   {  
     fout.write(i);      
   }  
   sis.close();  
   fout.close();    
   fin1.close();    
   fin2.close();    
  
  }  
} 