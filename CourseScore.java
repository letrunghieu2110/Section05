package trungtamjava.model;

import java.util.Scanner;

public class CourseScore {
	int id;
	String name;
	float score;

	public CourseScore() {

	}

	public CourseScore(int id, String name, float score) {
		this.id = id;
		this.name = name;
		this.score = score;
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

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public void input() {
		System.out.println("Please enter ID + Name + Score : ");

		Scanner scID = new Scanner(System.in);
		System.out.println("Enter the ID : ");
		id = scID.nextInt();

		Scanner scName = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = scName.nextLine();

		Scanner scScore = new Scanner(System.in);
		System.out.println("Enter the score : ");
		score = scScore.nextFloat();
	}

	public void info() {
		System.out.println("---------------------");
		System.out.println("Informaton of student : ");
		System.out.println(id);
		System.out.println(name);
		if (score < 5) {
			System.out.println("hsh yeu");
		} else if (score >= 5 && score < 7) {
			System.out.println("hsh TB");
		} else if (score >= 7 && score < 8) {
			System.out.println("hsh Kha");
		} else if (score >= 8 && score < 9) {
			System.out.println("hsh Gioi");
		} else {
			System.out.println("hsh Xuat sac");
		}

		System.out.println("---------------------");
	}

}
