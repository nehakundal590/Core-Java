package com.keyword;



public class Driver {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		Driver d1 = new Driver();
		d1.a++;
		d1.b++;

		d1.a++;
		d1.b++;

		System.out.println(d1.a); // 12
		System.out.println(d1.b); // 22

		Driver d2 = new Driver();
		d2.a++;
		d2.b++;

		d2.a++;
		d2.b++;
		System.out.println(d2.a); // 12
		System.out.println(d2.b); // 24

	}

}
