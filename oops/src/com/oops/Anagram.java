package com.oops;
//String is anagram or not
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="School Master";
		String str2="The Classroom";
		
		//Step:-1 [Remove the space]//Remove Space manually logic
		str1=str1.replace(" ","");
		str2=str2.replace(" ","");
		
		//Step:-2 upper case, lower case
		str1=str1.toLowerCase();       //---------->schoolmaster
		str2=str2.toLowerCase();       //----------->theclassroom
		
		//Step:-3 convert it into char Array
		char ar1[]=str1.toCharArray();
		char ar2[]=str2.toCharArray();
		
		//Step:-4 sorting
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		//Step:-5 check both string are anagram are not
		//if(ar1.equals(ar2))
		if(Arrays.equals(ar1,ar2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
	}

}
