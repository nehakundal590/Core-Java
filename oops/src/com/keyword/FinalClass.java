package com.keyword;

final class test1 {
	int b = 10;

	void m1() {
		System.out.println("rahul");
	}

	void m2() {
		System.out.println("verma");
	}
}

class test2 { // not inherit this class because upper class is final
	int c = 20;

	void m3() {
		System.out.println("rahul verma");
	}

	void m4() {
		System.out.println("verma rahul");
	}
}

public class FinalClass {
	public static void main(String[] args) {
		test2 a1 = new test2();
		System.out.println(a1.c);
		a1.m3();
		a1.m4();
		test1 t1 = new test1();
		System.out.println(t1.b);
		t1.m2();
		t1.m1();
	}
}
