package com.keyword;
//abstract class keywords

abstract class animal {
	animal() {
		System.out.println("All animals ..............");
	}

	public abstract void sound();
}

class Dog extends animal {
//			Dog(){     // constructor 
//				super();  
//			}
	public void sound() {
		System.out.println("Dog is barking ");
	}
}

class Lion extends animal {
//			Lion(){
//				super();
//			}
	public void sound() {

		System.out.println("Lion is Roar ");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Lion l1 = new Lion();
		d1.sound();
		l1.sound();
	}
}



