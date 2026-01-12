package com.fileHandling;

import java.io.File;

public class CreateFolder {
	public static void main(String[] args) {
		File file = new File("Java programming");
        // creates File object for folder

        boolean folderCreated = file.mkdir();
        // mkdir(): creates a single folder
        // returns true if folder is created
        // returns false if folder already exists or fails

        System.out.println(folderCreated);
        // prints result (true / false)
	}
}