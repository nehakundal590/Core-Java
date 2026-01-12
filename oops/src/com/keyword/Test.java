package com.keyword;



abstract class Vehicle {

}

class Car extends Vehicle {
	Car() {
		System.out.println("Car constructor");
	}
}

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
	}
}
