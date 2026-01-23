package com.fileHandling;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {

    public static void main(String[] args) {

        File folder = new File("Files");

        // Step 1: Create folder if not exists
        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(folder, "info.txt");

        // Step 2, 3, 4 using try-with-resources
        try (FileWriter fw = new FileWriter(file, true)) {

            fw.write("Java File Handling\n");
            fw.write("Appending data example\n");
            fw.write("----------------------\n");

            System.out.println("Data appended successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

