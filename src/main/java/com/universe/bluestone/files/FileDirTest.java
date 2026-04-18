package com.universe.bluestone.files;

import java.io.File;

public class FileDirTest {

	public static void main(String[] args) {
		// Lists all files in folder
		File folder = new File("D:/tmp");
		File fList[] = folder.listFiles();
		// Searchs .lck
		for (int i = 0; i < fList.length; i++) {
		    String fileName = fList[i].toString();
		    
		    
		    
		    System.out.println(fileName +" ,");
		    
		}
	}

}
