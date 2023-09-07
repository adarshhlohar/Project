package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Seting the price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void hello() {
		System.out.println("This is a init method : hello everyone");
	}
	
	public void bye() {
		System.out.println("Hello good by i am going ");
	}
}
