package com.startjava.lesson4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private boolean isAlive;
	private int countOfAttempts;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		isAlive = true;
		randomNumber = (int) (Math.random() * 101);
		countOfAttempts = 0;
		System.out.println("У вас 10 попыток");
		player1.cleanGuessNumber();
		player2.cleanGuessNumber();
		do {
			countOfAttempts++;
			makeMove(player1);
			if (isAlive) {
				makeMove(player2);
			}
		} while (isAlive && (countOfAttempts < 10));
		System.out.println(Arrays.toString(player1.getGuessNumbers(countOfAttempts)));
		if (randomNumber == player1.getGuessNumber(countOfAttempts-1)) {
			System.out.println(Arrays.toString(player2.getGuessNumbers(countOfAttempts - 1)));
		} else {
			System.out.println(Arrays.toString(player2.getGuessNumbers(countOfAttempts)));
		}
	}

	private void makeMove(Player player) {
		System.out.print(player.getName() + ", введите предполагаемое число: ");
		player.putGuessNumber(scan.nextInt(), countOfAttempts-1);
		scan.nextLine();
		switch (compareNumbers(player.getGuessNumber(countOfAttempts-1))) {
			case '>':
				System.out.println("Вы ввели число, которое больше того, которое загадал компьютер (" + randomNumber + ")");
				break;
			case '<':
				System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер (" + randomNumber + ")");
				break;
			case '=':
				System.out.println(player.getName() + ", Вы угадали c " + countOfAttempts + " попытки! Это число - " + randomNumber);
				isAlive = false;
				break;
			default:
				break;
		}
		if ((countOfAttempts == 10) && isAlive) {
			System.out.println("У " + player.getName()  + " закончились попытки");
		}
	}

	private char compareNumbers(int guessNumber) {
		if (guessNumber > randomNumber) {
			return '>';
		} else if (guessNumber < randomNumber) {
			return '<';
		} else
			return '=';
	}
}