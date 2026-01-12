
/* package keywords;

public class Static {
	static int a = 10;

	public static void main(String[] args) {
		System.out.println(Static.a);
	}
}
 */
/*
package keywords;	
	
 public class Static {
	 static void m1() {
			System.out.println("hello");
		}
	public static void main(String[] args) {
		
		m1(); // call by method name
		
		Static.m1();  // call by class name
	}
}
   */

package com.keyword;

public class Static {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		Static s1 = new Static();
		s1.a++;
		s1.b++;

		s1.a++;
		s1.b++;

		System.out.println(s1.a); // 12
		System.out.println(s1.b); // 22
		System.out.println(Static.b); // 22

	}
}
