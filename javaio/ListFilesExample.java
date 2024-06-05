package com.javaio;

import java.io.File;

public class ListFilesExample {
    public static void main(String[] args) {
        // Specify the directory path
        File directory = new File("parentDir");

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // List the files in the directory
            File[] filesList = directory.listFiles();

            if (filesList != null) {
                // Print the files and count them
                System.out.println("Files in directory " + directory.getPath() + ":");
                for (File file : filesList) {
                    System.out.println(file.getName());
                }
                System.out.println("Total number of files: " + filesList.length);
            } else {
                System.out.println("The directory is empty or an I/O error occurred.");
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }
}
