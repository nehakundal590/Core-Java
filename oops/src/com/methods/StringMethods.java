package com.methods;



//String Methods
public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Verma";
		String s2 = "Verma";
		String s3 = new String("Verma");
		System.out.println("Content comparison .eguals()");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		System.out.println("---------------------");
		System.out.println("Reference Comparison  (==)");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println("--------------------------");
		System.out.println("To get a character based on the given index.");
		String str = "Java";
		System.out.println(str.charAt(2));

		System.out.println("------------------------------");
		System.out.println("To get the size of the String");
		String str1 = "Java";
		System.out.println("Length: " + str1.length());

		System.out.println("-----------------------------");
		System.out.println("To join Two String .concat()");
		String strr1 = "Hello";
		String strr2 = "World";
		String result = strr1.concat(" ").concat(strr2);
		System.out.println(result); // Output: Hello World

		System.out.println("-----------------------------");
		System.out.println("Replace a character");
		String str3 = "Java";
		String newStr = str3.replace('a', 'o');
		System.out.println(newStr); // Output: Jovo

		System.out.println("------------------------------");
		System.out.println("Replace a word");
		String sentence = "I like Python";
		String newSentence = sentence.replace("Python", "Java");
		System.out.println(newSentence); // Output: I like Java

		System.out.println("-----------------------------");
		System.out.println("converts all characters in a string to uppercase letters.");
		String name1 = "rahul";
		String upperStr = name1.toUpperCase();
		System.out.println(upperStr); // Output: RAHUL

		System.out.println("---------------------------------");
		System.out.println("converts all characters in a string to lowercase letters.");
		String name2 = "VERMA";
		String lowerStr = name2.toLowerCase();
		System.out.println(lowerStr); // Output: verma

		System.out.println("-------------------------------");
		System.out.println("To get first occurence (repeated character).");
		String name3 = "Java Programming";
		int index = name3.indexOf('P');
		System.out.println(index); // Output: 5

		System.out.println("----------------------------");
		System.out.println("");
	}

}
