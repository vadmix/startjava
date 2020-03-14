package com.startjava.lesson4.calculator;

import static java.lang.Math.*;

public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char operator;

	public Calculator(String srcExpression) {
		String[] membersOfExpression = srcExpression.split(" ");
		firstNumber = Integer.parseInt(membersOfExpression[0]);
		operator = membersOfExpression[1].charAt(0);
		secondNumber = Integer.parseInt(membersOfExpression[2]);
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public void calculate() {
		int result;
		switch (operator) {
			case '+':
				System.out.println("Складываем");
				result = addExact(firstNumber, secondNumber);
				System.out.println(firstNumber + "+" + secondNumber + "=" + result);
				break;
			case '-':
				System.out.println("Вычитаем");
				result = subtractExact(firstNumber, secondNumber);
				System.out.println(firstNumber + "-" + secondNumber + "=" + result);
				break;
			case '*':
				System.out.println("Умножаем");
				result = multiplyExact(firstNumber, secondNumber);
				System.out.println(firstNumber + "*" + secondNumber + "=" + result);
				break;
			case '/':
				System.out.println("Делим");
				result = floorDiv(firstNumber, secondNumber);
				System.out.println(firstNumber + "/" + secondNumber + "=" + result);
				break;
			case '%':
				System.out.println("Находим остаток от деления");
				result = floorMod(firstNumber, secondNumber);
				System.out.println(firstNumber + "%" + secondNumber + "=" + result);
				break;
			case '>':
				System.out.println("Находим максимум");
				result = max(firstNumber, secondNumber);
				System.out.println("max(" + firstNumber + "," + secondNumber + ")=" + result);
				break;
			case '<':
				System.out.println("Находим минимум");
				result = min(firstNumber, secondNumber);
				System.out.println("min(" + firstNumber + "," + secondNumber + ")=" + result);
				break;
			case '^':
				System.out.println("Возводим в степень");
				result = 1;
				for (int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println(firstNumber + "^" + secondNumber + "=" + result);
				break;
			default:
				System.out.println("Выбрана неверная операция");
				break;
		}
	}
}