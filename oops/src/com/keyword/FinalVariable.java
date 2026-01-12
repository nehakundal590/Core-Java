

/*package keywords;
 * 
 * 
  // final variables
//if we declare a variable as a final we cann't change or update the value of this variables 



public class FinalVariables {
		
	public static void main(String[] args) {
		
		
		final int A = 10;
		System.out.println(A);
		
		A = 20;  //  value update (error: The final local variable A cannot be assigned.)  // not possible

		System.out.println(A);

	}

}*/

/*package keywords;

class A {
	int a = 10;   // default
	
}
public class FinalVariables {
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.a = 20;   // update
		System.out.println(a1.a);
				
	}

} */
package com.keyword;


class A {
	final int a = 10; // default

}

public class FinalVariable {

	public static void main(String[] args) {
		A a1 = new A();
//		a1.a = 20;
		System.out.println(a1.a);

	}

}
