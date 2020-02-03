package com.startjava.lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
    	int firstNumber = 3;
    	int secondNumber = 2;
    	char operator = '^';

    	if (operator == '+') {
    		System.out.println("Складываем");
    		System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
    	} else if (operator == '-') {
    		System.out.println("Вычитаем");
    		System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
    	} else if (operator == '*') {
    		System.out.println("Умножаем");
    		System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
    	} else if (operator == '/') {
    		System.out.println("Делим");
    		System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
    	} else if (operator == '%') {
    		System.out.println("Находим остаток от деления");
    		System.out.println(firstNumber + "%" + secondNumber + "=" + (firstNumber % secondNumber));
    	} else if (operator == '^') {
    		int result = 1;
    		System.out.println("Возводим в степень");
    		System.out.print(firstNumber + "^" + secondNumber + "=");
    		for (int i = 0; i < secondNumber; i++) {
    			result *= firstNumber;
    		}
    		System.out.print(result);
    		System.out.println();
    	}
    }
}