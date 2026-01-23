package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WriteAndReadFile {
    public static void main(String[] args) throws IOException {
        // Step 1: Create folder
        File folder = new File("MyFolder");
        folder.mkdir(); // creates folder if it doesn't exist

        // Step 2: Write data to file (Append mode)
        FileWriter fw = new FileWriter("MyFolder/myfile.txt", true); // true = append
        fw.write("Java Developer\n");
        fw.close();

        // Step 3: Read one line from the file
        FileReader fr = new FileReader("MyFolder/myfile.txt");
        BufferedReader br = new BufferedReader(fr);

        String content = br.readLine(); // reads only first line
        System.out.println(content); // print on console

        br.close();
        fr.close();

       
    }
}

// ---------------------- Short Notes ----------------------
// FileWriter  : Used to write characters/data into a file. 
//               'true' parameter = append mode ON (adds data at end).
// FileReader  : Used to read characters/data from a file.
// BufferedReader : Wraps FileReader for efficient reading and allows reading one line at a time using readLine().


// br ke through ek method call ho rahi hai readLine(). Ye method BufferedReader ki method hai,
//jo file se ek line read karke String return karti hai.

//br → BufferedReader ka object
//readLine() → ek line read karta hai
//Return type → String