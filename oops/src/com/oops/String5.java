package com.oops;
//To remove space without using inbuilt method

public class String5 {
	public static void main(String[] args) {
		String s="Neha kundal";
		String emptyString="";
		
		//Step 1:--To find the length of given String
		int n=s.length();
		System.out.println(n);
		
		//Step 2:---
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			if(ch !=' '){
			emptyString=emptyString+ch;
		}
	}
		System.out.println(emptyString);
	}


}
