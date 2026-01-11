package com.oops;
import java.io.File;
public class CreateFolder {
// How to create a folder in Java


    public static void main(String[] args) {

        File f1 = new File("Java");
        // creates File object for folder

        boolean folderCreated = f1.mkdir();
        // mkdir(): creates the folder

        System.out.println(folderCreated);
        // prints true if folder created, false otherwise
    }
}
