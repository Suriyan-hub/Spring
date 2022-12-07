package com.demo.mavendemo;


public class Tyre {
	private String brand;

	//Constructor Injection
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
	//Bean Property
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	

}
