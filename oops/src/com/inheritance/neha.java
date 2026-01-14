package com.inheritance;

//extends keywords (is a relation) (type of inheritance )inherit the properties of parent to child
class parent {
	int a = 10;

	void m1() {
		System.out.println("m1 method inside the class parent ");
	}
}

class child extends parent {
	int b = 20;

	void m2() {
		System.out.println("m2 method inside the class child ");
	}

}

public class neha {

	public static void main(String[] args) {
		child c1 = new child();
		System.out.println(c1.a);
		c1.m1();
		System.out.println(c1.b);
		c1.m2();

	}

}
