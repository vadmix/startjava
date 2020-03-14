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

	public int calculate() {
		//int result;
		switch (operator) {
			case '+':
				System.out.println("Складываем");
				return addExact(firstNumber, secondNumber);
				//System.out.println(firstNumber + "+" + secondNumber + "=" + result);
				//break;
			case '-':
				System.out.println("Вычитаем");
				return subtractExact(firstNumber, secondNumber);
				//System.out.println(firstNumber + "-" + secondNumber + "=" + result);
				//break;
			case '*':
				System.out.println("Умножаем");
				return multiplyExact(firstNumber, secondNumber);
				//System.out.println(firstNumber + "*" + secondNumber + "=" + result);
				//break;
			case '/':
				System.out.println("Делим");
				return floorDiv(firstNumber, secondNumber);
				//System.out.println(firstNumber + "/" + secondNumber + "=" + result);
				//break;
			case '%':
				System.out.println("Находим остаток от деления");
				return floorMod(firstNumber, secondNumber);
				//System.out.println(firstNumber + "%" + secondNumber + "=" + result);
				//break;
			case '>':
				System.out.println("Находим максимум");
				return max(firstNumber, secondNumber);
				//System.out.println("max(" + firstNumber + "," + secondNumber + ")=" + result);
				//break;
			case '<':
				System.out.println("Находим минимум");
				return min(firstNumber, secondNumber);
				//System.out.println("min(" + firstNumber + "," + secondNumber + ")=" + result);
				//break;
			case '^':
				System.out.println("Возводим в степень");
				int result = 1;
				for (int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				return result;
				//System.out.println(firstNumber + "^" + secondNumber + "=" + result);
				//break;
			default:
				System.out.println("Выбрана неверная операция");
				return 0;
				//break;
		}
	}
}