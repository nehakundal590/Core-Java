package com.oops;
//Nested try catch
//ArithemticException
//NumberFormatException
//StringIndexOfBoundsException
//ArrayIndexOutOfBoundsException


public class Handling {
	public static void main(String[] args) {
		int arr[]=new int[5];
		System.out.println("Exception Handling");
		try {
			System.out.println(arr[5]);
			
			try {
			System.out.println(arr[4]/0);
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Hello");
	}
}
	


