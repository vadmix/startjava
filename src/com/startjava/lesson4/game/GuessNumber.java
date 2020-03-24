package com.startjava.lesson4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private int countOfAttempts;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		randomNumber = (int) (Math.random() * 101);
		System.out.println("У вас 10 попыток.");
		System.out.println("Компьютер загадал число " + randomNumber);
		do {
			countOfAttempts++;
			if (!makeMove(player1)) {
				player1.setCountOfAttempts(countOfAttempts);
				player2.setCountOfAttempts(countOfAttempts - 1);
				break;

			} else {
				if (!makeMove(player2)){
					player1.setCountOfAttempts(countOfAttempts);
					player2.setCountOfAttempts(countOfAttempts);
					break;
				}
			}
		} while ((countOfAttempts < 10));

		System.out.println(Arrays.toString(player1.getGuessNumbers()));
		System.out.println(Arrays.toString(player2.getGuessNumbers()));

		player1.cleanGuessNumbers();
		player2.cleanGuessNumbers();
		countOfAttempts = 0;
	}

	private boolean makeMove(Player player) {
		inputNumber(player);
		if (!compareNumbers(player.getGuessNumber(countOfAttempts-1))) {
			if (countOfAttempts == 10) {
				System.out.println("У " + player.getName() + " закончились попытки");
			}
			return true;
		} else return false;
	}

	private void inputNumber(Player player) {
		System.out.print(player.getName() + ", введите предполагаемое число: ");
		player.putGuessNumber(scan.nextInt(), countOfAttempts-1);
		scan.nextLine();
	}

	private boolean compareNumbers(int guessNumber) {
		if (guessNumber > randomNumber) {
			System.out.println("Вы ввели число, которое больше того, которое загадал компьютер");
			return false;
		} else if (guessNumber < randomNumber) {
			System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер");
			return false;
		} else {
			System.out.println("Вы угадали c " + countOfAttempts + " попытки! Это число - " + randomNumber);
			return true;
		}
	}
}