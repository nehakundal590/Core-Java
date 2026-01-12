package com.fileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// How to Write  inside the file in java programming 
public class writeInFileAppend {
    public static void main(String[] args) throws IOException {
        // Step 1: Create folder
        File folder = new File("Java programming");
        folder.mkdir();

        // Step 2: Create file inside folder
        File file = new File(folder, "data.txt");
        file.createNewFile();

        // Step 3: Write data in APPEND mode
        FileWriter fw = new FileWriter(file, true); // true = append mode
        fw.write("\nHello Java");
        fw.write("\nFile Handling Append Mode");

        // Step 4: Close writer
        fw.close();

        System.out.println("Data written successfully");
    }
}


/*
  Program: WriteInFileAppend
  Description: This program demonstrates how to write data to a file in Java
               using FileWriter in APPEND mode.
  
  Steps:
  1. Create a folder (if it does not exist)
  2. Create a file inside the folder (if it does not exist)
  3. Write data into the file in APPEND mode
  4. Close the FileWriter to save changes
  
  Notes:
  - FileWriter with 'true' as the second parameter enables append mode.
  - IOException is thrown if any file operation fails.
 */
