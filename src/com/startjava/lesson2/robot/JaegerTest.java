package com.startjava.lesson2.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		jaeger1.setModelName("Bracer Phoenix");
		jaeger1.setMark("Mark-5");
		jaeger1.setWeight(2.128f);
		jaeger1.setHeight(70.91f);

		Jaeger jaeger2 = new Jaeger();
		jaeger2.setModelName("November Ajax");
		jaeger2.setMark("Mark-6");
		jaeger2.setWeight(2.478f);
		jaeger2.setHeight(78.94f);

		jaeger1.move();
		jaeger1.takeGun();
		System.out.println(jaeger2.signal());
		jaeger2.shoot();
		jaeger1.setWeight(1.453f);
		jaeger1.setHeight(50.32f);
		jaeger2.putGunAway();
		System.out.println(jaeger1.getModelName() + " - рост: " + jaeger1.getHeight());
		System.out.println(jaeger1.getModelName() + " - вес: " + jaeger1.getWeight());
	}
}