package com.fileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
          
            //  Write to a file (Overwrite mode by default)
         
            File f1 = new File("Rahul.txt"); // Create file object
            FileWriter fw1 = new FileWriter(f1); // Default is overwrite mode
            fw1.write("I am Rahul Verma"); // Write data
            fw1.close(); // Always close to save changes
            
            System.out.println("Data written in overwrite mode.");

            // 2️ Write to a file in Append mode
          
            File folder = new File("MyFolder"); // Create folder
            folder.mkdir(); // Creates folder if it doesn't exist

            FileWriter fw2 = new FileWriter("MyFolder/myfile.txt", true); // 'true' = append mode
            fw2.write("\nJava Developer"); // Data will be added at the end
            fw2.close();
            System.out.println("Data written in append mode.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
