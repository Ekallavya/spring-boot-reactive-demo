package com.universe.bluestone.files;

import java.util.Scanner;

public class ScanerTest1 {  
	public static void main(String args[]){  
	     String input = "10 tea 20 coffee 30 tea buiscuits";  
	     Scanner s = new Scanner(input).useDelimiter("\\s");  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	     s.close();   
	}}  
