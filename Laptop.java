package com.trungtamjava.model;

public class Laptop {
	String type;
	int price;
	float memory;

	public Laptop() {

	}

	public Laptop(String type, int price, float memory) {
		this.type = type;
		this.price = price;
		this.memory = memory;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getMemory() {
		return memory;
	}

	public void setMemory(float memory) {
		this.memory = memory;
	}

}
