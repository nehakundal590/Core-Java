package com.inheritance;
class Address {
	int streetNo;
	int pinCode;
	String cityName;
	String stateName;

	public Address(int streetNo, int pinCode, String cityName, String stateName) {
		this.streetNo = streetNo;
		this.pinCode = pinCode;
		this.cityName = cityName;
		this.stateName = stateName;
	}

	void showAddress() {
		System.out.println(streetNo + " " + pinCode + " " + cityName + " " + stateName);
	}

	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", pinCode=" + pinCode + ", cityName=" + cityName + ", stateName="
				+ stateName + "]";
	}
}

class Student {
	String stName;
	Address ad;

	public Student(String stName, Address ad) {
		this.stName = stName;
		this.ad = ad;
	}

	void showStudent() {
		System.out.println(stName + " " + ad);
	}
}

public class Aggregation {
	public static void main(String[] args) {
		Address a1 = new Address(110, 182122, "Jaipur", "Rajasthan");
		Address a2 = new Address(111, 182123, "Kota", "Rajasthan");
		Address a3 = new Address(112, 182124, "Bikaner", "Rajasthan");
		Address a4 = new Address(113, 182125, "Sikar", "Rajasthan");
		Address a5 = new Address(114, 182126, "Jodhapur", "Rajastrhan");
		Address a6 = new Address(115, 182127, "kota", "Rajasthan");
		Address a7 = new Address(116, 182128, "bhopal", "Madhay pardesh");
		a1.showAddress();
		a2.showAddress();
		a3.showAddress();
		a4.showAddress();
		a5.showAddress();
		a6.showAddress();
		a7.showAddress();
		Student s1 = new Student("Rahul verma", a1);
		Student s2 = new Student("Devansh", a2);
		Student s3 = new Student("Tarun", a3);
		Student s4 = new Student("Rahul Pareek", a4);
		Student s5 = new Student("Traun kalla", a5);
		Student s6 = new Student("Rajdeep", a6);
		Student s7 = new Student("Rohit", a7);
		s1.showStudent();
		s2.showStudent();
		s3.showStudent();
		s4.showStudent();
		s5.showStudent();
		s6.showStudent();
		s7.showStudent();
	}

}