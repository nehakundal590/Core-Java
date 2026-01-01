package com.oops;
// String Inbuilt Method
/*CharAt();
 * concat();
 * contains();
 * endsWith();
 * StartWith();
 * indexOf();
 * value of()------->for conversion purpose
 * s.trim();
 * equalsIgnoreCase();
 * s.replaceAll( "\\s+",")
 * LastIndexof()
 */

public class String4 {
	public static void main(String[] args) {
		String s1="Neha Kundal";
		System.out.println(s1.charAt(0));
		System.out.println(s1.concat("Student"));
		System.out.println(s1.contains("Ne"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.startsWith("l"));
		System.out.println(s1.indexOf("u"));
		String s0="12";
		String s2="12";
		Integer i1=Integer.valueOf(s0);
		Integer i2=Integer.valueOf(s2);
		System.out.println(i1+i2);
		
		//--------------------------
		
		Integer i3=12;
		Integer i4=12;
		
		String sn=String.valueOf(i3);
		String sm=String.valueOf(i4);
		System.out.println(sn+sm);
		//-------------------------->
		String sc=" Neha Devi ";
		System.out.println(sc.trim());
		
		//-------------------------->
		String s ="    Neha        Java   Student     ";
		System.out.println(s.replaceAll("\\s+",""));
		
		
		
	}

}
