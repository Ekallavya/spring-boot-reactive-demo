package com.universe.bluestone.files;

import java.io.*;  
public class FileReaderTest{  
 public static void main(String args[])throws Exception{  
  FileReader fr=new FileReader("D:/tmp/abc.txt");  
  int i;  
  while((i=fr.read())!=-1)  
  System.out.println((char)i);  
  
  fr.close();  
 }  
} 
