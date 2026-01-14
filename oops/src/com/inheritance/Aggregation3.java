package com. inheritance;

class Writer {
	String name;
	String address;
	double rating;

	public Writer(String name, String address, double rating) {
		this.name = name;
		this.address = address;
		this.rating = rating;
	}

	void showWriter() {
		System.out.println("Writer Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Rating : " + rating);
	}

	@Override
	public String toString() {
		return "Writer [name=" + name + ", address=" + address + ", rating=" + rating + "]";
	}
}

class Copy {
	int bookId;
	String name;
	int price;
	int published;
	Writer writer;

	public Copy(int bookId, String name, int price, int published, Writer writer) {
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.published = published;
		this.writer = writer;
	}

	void showCopy() {
		System.out.println("Book ID        : " + bookId);
		System.out.println("Book Name      : " + name);
		System.out.println("Price          : " + price);
		System.out.println("Published Year : " + published);
		System.out.println("Writer         : " + writer);

	}
}

public class Aggregation3 {
	public static void main(String[] args) {
		Writer w1 = new Writer("Prasoon Sir", "Rajasthan", 4.5);
		Writer w2 = new Writer("Rahul Verma", "Jammu", 4.2);
		Writer w3 = new Writer("Prasoon Sir", "Gujarat", 4.7);
		Writer w4 = new Writer("Prasoon Sir", "Delhi", 4.3);
		Writer w5 = new Writer("Prasoon Sir", "Goa", 4.0);
		Writer w6 = new Writer("Prasoon Sir", "Punjab", 4.6);
		w1.showWriter();
		w2.showWriter();
		w3.showWriter();
		w4.showWriter();
		w5.showWriter();
		w6.showWriter();

		Copy b1 = new Copy(101, "Java", 5999, 1999, w1);
		Copy b2 = new Copy(102, "Python", 4999, 2000, w2);
		Copy b3 = new Copy(103, "Spring Boot", 3999, 2001, w3);
		Copy b4 = new Copy(104, "Python Advanced", 2999, 2002, w4);
		Copy b5 = new Copy(105, "DSA", 1999, 2003, w5);
		Copy b6 = new Copy(106, "C Language", 1979, 2004, w6);

		b1.showCopy();
		b2.showCopy();
		b3.showCopy();
		b4.showCopy();
		b5.showCopy();
		b6.showCopy();
	}
}
