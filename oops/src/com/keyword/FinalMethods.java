package com.keyword;



class Final {
	void mNumber() {
		System.out.println("12345678");
	}

	final void atmPin() {
		System.out.println("1678");
	}
}

class test extends Final {

	@Override
	void mNumber() {
		System.out.println("12345678");
	}
//			 void atmPin() 
//			{
//				System.out.println("1678");
//			}
}

public class FinalMethods {

	public static void main(String[] args) {
		test t1 = new test();
		t1.mNumber();
		t1.atmPin();
	}

}

/*
 * final method : whenever we declare a method as a a final we cann't override
 * this method (to our extended class )
 */
