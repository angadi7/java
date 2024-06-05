package com.javaio;

import java.io.File;

public class ListDirectoriesExample {
    public static void main(String[] args) {
        // Specify the directory path
        File directory = new File("parentDir");

        // Check if the directory exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            // List the files and directories in the directory
            File[] filesList = directory.listFiles();

            if (filesList != null && filesList.length > 0) {
                System.out.println("Directories in " + directory.getPath() + ":");
                for (File file : filesList) {
                    if (file.isDirectory()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }
}
