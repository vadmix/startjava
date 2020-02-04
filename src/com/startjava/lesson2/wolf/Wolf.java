package com.startjava.lesson2.wolf;

public class Wolf {

	private String sex;
	private String name;
	private double weight;
	private int age;
	private String color;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("\"".concat(Integer.toString(age)).concat("\"").concat(" - некорректный возраст. Возможно, Вы имели ввиду \"8\""));
			this.age = 8;
		} else this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void walk() {
		System.out.println("Волк идет");
	}

	public void sit() {
		System.out.println("Волк сидит");
	}

	public void run() {
		System.out.println("Волк бежит");
	}

	public void hawl() {
		System.out.println("Волк воет");
	}

	public void hunt() {
		System.out.println("На волка ведется охота");
	}
}