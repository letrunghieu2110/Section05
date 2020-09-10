package com.trungtamjava.model;

public class Chair {
	String color;
	int price;
	String type;

	public Chair() {

	}

	public Chair(String color, int price, String type) {
		this.color = color;
		this.price = price;
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
