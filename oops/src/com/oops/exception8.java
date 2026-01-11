package com.oops;

public class exception8{

	public static void main(String[] as) {
		System.out.println("Program start");
		// int arr [] = new int[5];
		try {
			int x = Integer.parseInt(as[0]);
			System.out.println(x);
			int y = 10 / 0;
			System.out.println(y);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide the value");
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("Please provide a valid number");
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("Please don't divide by zero");
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("Please don't do this");
			System.out.println(e);
		}
		System.out.println("Program end");
	}
}
