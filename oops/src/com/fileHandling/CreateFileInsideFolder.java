package com.fileHandling;



import java.io.File;
import java.io.IOException;


//  How to create a file inside the folder using the java programming. 
public class CreateFileInsideFolder {

    public static void main(String[] args) throws IOException {
    	// Step 1: Create folder
        File folder = new File("Java programming");
        // creates File object for folder

        folder.mkdir();
        // mkdir(): creates folder if it does not exist

        // Step 2: Create file inside folder
        File file = new File(folder, "example.txt");
        // creates File object for file inside folder

        boolean fileCreated = file.createNewFile();
        // createNewFile(): creates the file
        // returns true if file is created
        // returns false if file already exists

        System.out.println(fileCreated);
        // prints result (true / false)
    }
}

//File class String type ka path (file name) accept karta hai
//File ek class hai jo java.io package me hoti hai
//IOException ek excepti
