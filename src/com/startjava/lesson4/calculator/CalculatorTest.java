package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator;
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Введите математическое выражение.");
			System.out.println("Для обозначения операции используйте следующие символы:");
			System.out.println("\"+\" - сложение");
			System.out.println("\"-\" - вычитание");
			System.out.println("\"*\" - умножение");
			System.out.println("\"/\" - целочисленное деление");
			System.out.println("\"%\" - деление по модулю");
			System.out.println("\">\" - поиск максимума");
			System.out.println("\"<\" - поиск минимума");
			System.out.println("\"^\" - возведение в степень");
			calculator = new Calculator(scan.nextLine());
			System.out.println("Результат: " + calculator.calculate());
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scan.nextLine();
			} while (!answer.equals("нет") && !answer.equals("да"));
		} while (!answer.equals("нет"));
	}
}