package com.packag;
//String object------->Immutable

public class String2 {
	public static void main(String[] args) {
		String s=new String("prasoon");
		System.out.println(s);
		s=s.concat("bidua"); //--->new object will created
		System.out.println(s);
		
//String Buffer---->Mutable changes are possible
		
		StringBuffer sb=new StringBuffer("prasoon");
		sb.append("bidua");
		System.out.println(sb);
		
		
		String s1=new String("neha");
		String s2=new String("neha");
		String s3="neha";
		
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1.equals(s3));
	}

}
