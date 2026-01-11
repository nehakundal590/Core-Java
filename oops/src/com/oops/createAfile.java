package com.oops;
import java.io.File;

import java.io.IOException;
public class createAfile {


  //   How to create a new file in java  
	
    public static void main(String[] args) throws IOException {
        // main() is the starting point of the Java program
        // throws IOException avoids using try-catch for file operations

//        // Creating a File object for "Rahulverma.txt"
//        File f1 = new File("Rahulverma.txt");
//
//        // createNewFile():
//        // returns true  → if file is created successfully
//        // returns false → if file already exists
//        boolean fcheck = f1.createNewFile();
//
//        // Printing the returned value (true / false)
//        System.out.println(fcheck);
    	
    	// or-or 

        // Creating another File object for "demo.txt"
        File file = new File("demo.txt");

        // Checking whether the file is newly created or already exists
        if (file.createNewFile()) {
            // Executes if demo.txt is created
            System.out.println("File created");
        } else {
            // Executes if demo.txt already exists
            System.out.println("File already exists");
        }
    }
}
