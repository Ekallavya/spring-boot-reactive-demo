package com.universe.bluestone.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMissmatchExample {

    public static void main(String[] args)
        throws IOException
    {
        Path path1 = Files.createTempFile("file1", ".txt");
        Path path2 = Files.createTempFile("file2", ".txt");
        Files.writeString(path1, "Geeks for geeks");
        Files.writeString(path2, "Geeks for geeks");

        long mismatch1 = Files.mismatch(path1, path2);

        System.out.println(
            "File Mismatch position or -1 is returned if there is no mismatch");

        System.out.println(
            "Mismatch position in file1 and file2 is : "
            + mismatch1);

        path1.toFile().deleteOnExit();
        path2.toFile().deleteOnExit();

        System.out.println();

        Path path3 = Files.createTempFile("file3", ".txt");
        Path path4 = Files.createTempFile("file4", ".txt");
        Files.writeString(path3, "Geeks for geeks");
        Files.writeString(path4, "Geeks for the geeks");

        long mismatch2 = Files.mismatch(path3, path4);

        System.out.println(
            "Mismatch position in file3 and file4 is : "
            + mismatch2);

        path3.toFile().deleteOnExit();
        path4.toFile().deleteOnExit();
    }
}