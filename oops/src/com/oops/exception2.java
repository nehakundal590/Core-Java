package com.oops;

public class exception2 {


 // Array Index Out Of Bound
	
	public static void main(String[] args) {
		int arr [] = new int [5];
		
		System.out.println(arr[5]);
        // ArrayIndexOutOfBound  
	
		System.out.println(arr [5]/0);
        // ArrayIndexOutOfBoundException
	}

}

