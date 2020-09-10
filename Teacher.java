package model;

import java.util.Scanner;

public class Teacher {

	int id;
	String name;
	String address;
	String facility;

	public Teacher() {

	}

	public Teacher(int id, String name, String address, String facility) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.facility = facility;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public void input() {
		System.out.println("Please enter information of teacher");
		Scanner scID = new Scanner(System.in);
		System.out.println("Enter the id :");
		id = scID.nextInt();
		Scanner scName = new Scanner(System.in);
		System.out.println("Enter the name :");
		name = scName.nextLine();
		Scanner scAddress = new Scanner(System.in);
		System.out.println("Enter thi address :");
		address = scAddress.nextLine();
		Scanner scFacility = new Scanner(System.in);
		System.out.println("Enter the facility :");
		facility = scFacility.nextLine();
	}

	public void info() {
		System.out.println("nformation of teacher");
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(facility);
		System.out.println("===============");
	}
}