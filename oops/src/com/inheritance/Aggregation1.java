package com. inheritance;

class Rahul {
	private int streetNo;
	private int pinCode;
	private String cityName;
	private String stateName;

	// Constructor
	public Rahul(int streetNo, int pinCode, String cityName, String stateName) {
		this.streetNo = streetNo;
		this.pinCode = pinCode;
		this.cityName = cityName;
		this.stateName = stateName;
	}

	// getters and setters (use)
	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "Rahul [streetNo=" + streetNo + ", pinCode=" + pinCode + ", cityName=" + cityName + ", stateName="
				+ stateName + "]";
	}

}

class Verma {
	private String stName;
	private Rahul ad;

	// Constructor
	public Verma(String stName, Rahul ad) {
		this.stName = stName;
		this.ad = ad;
	}

	// Getters and Setters
	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public Rahul getAd() {
		return ad;
	}

	public void setAd(Rahul ad) {
		this.ad = ad;
	}

	public void showVerma() {
		System.out.println("Student Name: " + stName);
		System.out.println("Address: " + ad);
	}
}

public class Aggregation1 {
	public static void main(String[] args) {
		Rahul a1 = new Rahul(101, 182122, "Jaipur", "Rajasthan");
		Rahul a2 = new Rahul(202, 654321, "Bikaner", "Rajasthan");

		Verma s1 = new Verma("Rahul Verma", a1);
		Verma s2 = new Verma("Rakshit Verma", a2);
//        s1.showVerma();
		s2.showVerma();

		s1.setStName("verma Rahu ");
		s1.getAd().setCityName("Jammu");

		System.out.println("\nAfter Update:");
		s1.showVerma();
	}
}
