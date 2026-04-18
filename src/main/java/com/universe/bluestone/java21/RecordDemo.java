package com.universe.bluestone.java21;

import com.universe.bluestone.dto.Student;

public class RecordDemo {
    public static void main(String[] args) {
        // Create record objects
        Student student1 = new Student(1, "Mahesh", "XII");
        Student student2 = new Student(2, "Sudhir", "XII");

        // Access components using accessor methods
        System.out.println("Student 1 ID: " + student1.id());
        System.out.println("Student 2 Name: " + student2.name());

        // Default toString() method output
        System.out.println(student1.toString());

        // Default equals() method usage
        System.out.println("Are students equal? " + student1.equals(student2));
    }
}
