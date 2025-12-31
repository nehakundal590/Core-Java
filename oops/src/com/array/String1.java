package com.array;

public class String1 {
	public static void main(String[] args) {
		String s1=new  String("prasoon");
		String s2= new String("prasoon");
		String s3=new String("java");
		String s4=new String("java");
		
		
		//.equal ()------> Check content
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));
		
		//== -------->check content
		System.out.println(s1==s2);
		System.out.println(s3==s1);
		
		
	}

}


