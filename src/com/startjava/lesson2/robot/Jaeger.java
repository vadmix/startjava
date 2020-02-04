package com.startjava.lesson2.robot;

public class Jaeger {

	private String modelName;
	private String mark;
	private float weight;
	private float height;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void takeGun() {
		System.out.println(modelName + " - Оружие в руке!");
	}

	public void putGunAway() {
		System.out.println(modelName + " - Оружие в кобуре!");
	}

	public void takeAim() {
		System.out.println(modelName + " - Враг на мушке!");
	}

	public void fireAway() {
		System.out.println(modelName + " - Пли!");
	}

	public void shoot() {
		takeGun();
		takeAim();
		fireAway();
	}

	public void move() {
		System.out.println(modelName + " - Идем!");
	}

	public String signal() {
		System.out.println(modelName + " - Загорелась красная лампочка!!!");
		return "Уиу-уиу-уиу";
	}
}