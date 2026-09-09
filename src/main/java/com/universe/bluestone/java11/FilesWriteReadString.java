package com.universe.bluestone.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesWriteReadString {
    public static void main(String[] args) {
        // 1. Create a Path object using the modern Java 11 Path.of() method
        Path filePath = Path.of("example.txt");

        try {
            // ---- WRITING A FILE ----
            String initialContent = "Hello, World!\nThis is a Java 11 file example.";
            
            // Overwrites the file if it exists, or creates it if it doesn't. 
            // Uses UTF-8 character encoding by default.
            Files.writeString(filePath, initialContent);
            System.out.println("--- File written successfully ---");


            // ---- APPENDING TO A FILE ----
            String additionalContent = "\nAppending this new line to the file.";
            
            // To append data, pass StandardOpenOption choices as parameters
            Files.writeString(filePath, additionalContent, 
                              StandardOpenOption.CREATE, 
                              StandardOpenOption.APPEND);
            System.out.println("--- Additional content appended ---");


            // ---- READING A FILE ----
            // Reads the entire file content directly into a single String
            String fileContent = Files.readString(filePath);
            
            System.out.println("\n--- Reading File Contents: ---");
            System.out.println(fileContent);

        } catch (IOException e) {
            // Always handle potential I/O exceptions when dealing with files
            System.err.println("An error occurred during file operations: " + e.getMessage());
            e.printStackTrace();
        }
    }
}