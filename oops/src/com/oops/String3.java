package com.oops;
//String ,String Builder String Buffer

public class String3 {
	public static void main(String[] args) {
	
		//Current Capacity 
		//Increment Capacity---->(cc*2)+2
		StringBuffer sb=new StringBuffer("neha");
		StringBuffer st=new StringBuffer();
		sb.append("1234567890123456");
		System.out.println("------>"+sb.capacity());
		System.out.println(sb.capacity());
		sb.ensureCapacity(40);
		System.out.println("Current capacity="+sb.capacity());
		
		StringBuilder sc=new StringBuilder();
		System.out.println(sc.capacity());
		
		System.out.println(sb.length());
		System.out.println(sb);
		
		
	}

}
