package com.trungtamjava.model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Person
		Person p = new Person();
		p.setName("Nguyen Van A");
		p.setAge(30);
		p.setSex("Male");
		p.setHeight((float) 1.70);
		p.setWeight((float) 57.3);

		Person p2 = new Person("Tran Thi B", 27, "Female", (float) 1.65, (float) 80.5);

		// Laptop
		Laptop la = new Laptop();
		la.setType("window");
		la.setPrice(3000);
		la.setMemory((float) 6.4);

		Laptop la2 = new Laptop("macbook", 3000, (float) 32.0);

		// Chair
		Chair ch = new Chair("Red", 10, "smaill");

		// Table
		Table ta = new Table();
		ta.setColor("Blue");
		ta.setPrice(200);
		ta.setType("big");

	}

}
