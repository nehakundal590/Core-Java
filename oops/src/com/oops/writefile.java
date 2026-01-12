package com.oops;

import java.io.FileWriter;
import java.io.IOException;

public class writefile {
	public static void main(String[] args) {
		try {
    FileWriter f = new FileWriter(
            "C:\\Users\\devin\\OneDrive\\Desktop\\data.txt"
        );

        f.write("Java programming is the best language");
        f.close();

        System.out.println("Successfully data wrote in file");

    } catch (IOException i) {
        System.out.println(i);
    }
}
}


