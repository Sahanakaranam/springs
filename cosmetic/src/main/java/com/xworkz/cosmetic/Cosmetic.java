package com.xworkz.cosmetic;

public class Cosmetic {
	
	private String brand;
	private int price;

	

	public Cosmetic(String brand) {
		super();
		this.brand = brand;
	}
	
	

	public String getBrand() {
		return brand;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public void enhanceTheBeauty() {
		System.out.println("invoked  enhanceTheBeauty()");
		System.out.println("enhanceTheBeauty");
	}

	public void makesFacePresentable() {
		System.out.println("invoked makesFacePresentable()");
		System.out.println("makesFacePresentable");
	}

}
