package com.oops;
import java.io.File;

import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws Exception {

        File file = new File("demo.txt");
        // creates a File object for demo.txt

        Scanner sc = new Scanner(file);
        // Scanner object reads data from the file

        while (sc.hasNextLine()) {
            // hasNextLine(): checks if another line is available
            System.out.println(sc.nextLine());
            // nextLine(): reads and prints one line from the file
        }

        sc.close();
        // close(): releases the Scanner resource
    }
}


