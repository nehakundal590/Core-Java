package com.oops;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        File file = new File("demo.txt");
        // creates File object for demo.txt

        boolean result = file.delete();
        // delete(): deletes the file
        // returns true if file is deleted
        // returns false if file does not exist or cannot be deleted

        System.out.println(result);
        // prints deletion result
    }
}
