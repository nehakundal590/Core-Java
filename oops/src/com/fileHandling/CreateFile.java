package com.fileHandling;




import java.io.*;
 // file created
public class CreateFile {

	public static void main(String[] args) throws IOException {

        File file = new File("Rahulverma.txt");
        // creates File object for Rahulverma.txt

        boolean fcheck = file.createNewFile();
        // createNewFile(): creates file
        // returns true if file is created
        // returns false if file already exists

        System.out.println(fcheck);
        // prints result (true / false)
		

	}

}