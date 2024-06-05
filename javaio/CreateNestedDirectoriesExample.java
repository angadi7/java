package com.javaio;

import java.io.File;

public class CreateNestedDirectoriesExample {
    public static void main(String[] args) {
        // Specify the directory path
        File directories = new File("parentDir/childDir");

        // Check if the directories already exist
        if (directories.exists()) {
            System.out.println("Directories already exist.");
        } else {
            // Create the directories
            if (directories.mkdirs()) {
                System.out.println("Directories created: " + directories.getPath());
            } else {
                System.out.println("Failed to create directories.");
            }
        }
    }
}

