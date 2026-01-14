package com.inheritance;

class car {
	void move() {
		System.out.println("move");
	}

	void brake() {
		System.out.println("brake");
	}
}

class Audi extends car {
	void autoPilot() {
		System.out.println("autoPiolet");
	}

	void autoGear() {
		System.out.println("autoGear");
	}
}

public class test {

	public static void main(String[] args) {

		Audi c1 = new Audi();
		c1.move();
		c1.autoGear();
		c1.autoPilot();
		c1.brake();

	}

}
