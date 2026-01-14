package com.inheritance;

class Author {
	String name;
	String address;

	public Author(String name, String address) {
		this.name = name;
		this.address = address;
	}

	void showAuthor() {
		System.out.println("Author Name: " + name + " " + "Auther address: " + address);
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", address=" + address + "]";
	}
}

class Book {
	String name;
	int price;
	int published;
	Author author;

	public Book(String name, int price, int published, Author author) {
		this.name = name;
		this.price = price;
		this.published = published;
		this.author = author;

	}

	void showBook() {
		System.out.println("Book name :" + name);
		System.out.println("Book price :" + " " + price);
		System.out.println("Book published :" + " " + published);
		System.out.println("Author :" + " " + author);
	}
}

public class Aggregation2 {

	public static void main(String[] args) {
		Author a1 = new Author("Prasooon Sir", "Rajasthan");
		Author a2 = new Author("Rahul Verma", "Jammu");
		Author a3 = new Author("Devansh", "Gujarat");
		Author a4 = new Author("Aniket Sharma", "Delhi");
		Author a5 = new Author("Tarun Kalla", "Goa");
		Author a6 = new Author("Rohit Sharma", "Punjab");
		a1.showAuthor();
		a2.showAuthor();
		a3.showAuthor();
		a4.showAuthor();
		a5.showAuthor();
		a6.showAuthor();

		Book b1 = new Book("Java", 5999, 1999, a1);
		Book b2 = new Book("Python", 4999, 2000, a2);
		Book b3 = new Book("SpringBoot", 3999, 2001, a3);
		Book b4 = new Book("Python", 2999, 2002, a4);
		Book b5 = new Book("DSA", 1999, 2003, a5);
		Book b6 = new Book("C", 1979, 2004, a6);
		b1.showBook();
		b2.showBook();
		b3.showBook();
		b4.showBook();
		b5.showBook();
		b6.showBook();

	}

}
