package com.startjava.lesson4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private boolean isAlive = true;
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
			makeMove(player1);
			if (isAlive) {
				makeMove(player2);
			}
		} while (isAlive && (countOfAttempts < 10));
		System.out.println(Arrays.toString(player1.getGuessNumbers(countOfAttempts)));
		player1.cleanGuessNumber(countOfAttempts);
		if (player2.getGuessNumber(countOfAttempts-1) == 0) {
			System.out.println(Arrays.toString(player2.getGuessNumbers(countOfAttempts - 1)));
			if (countOfAttempts > 1) {
				player2.cleanGuessNumber(countOfAttempts - 1);
			}
		} else {
			System.out.println(Arrays.toString(player2.getGuessNumbers(countOfAttempts)));
			player2.cleanGuessNumber(countOfAttempts);
		}
		System.out.println(Arrays.toString(player1.guessNumbers));
		System.out.println(Arrays.toString(player2.guessNumbers));

		isAlive = true;
		countOfAttempts = 0;
	}

	private void makeMove(Player player) {
		requestNumber(player);
		compareNumbers(player.getGuessNumber(countOfAttempts-1));
		if ((countOfAttempts == 10) && isAlive) {
			System.out.println("У " + player.getName()  + " закончились попытки");
		}
	}

	private void requestNumber(Player player) {
		System.out.print(player.getName() + ", введите предполагаемое число: ");
		player.putGuessNumber(scan.nextInt(), countOfAttempts-1);
		scan.nextLine();
	}

	private void compareNumbers(int guessNumber) {
		if (guessNumber > randomNumber) {
			System.out.println("Вы ввели число, которое больше того, которое загадал компьютер");
		} else if (guessNumber < randomNumber) {
			System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер");
		} else {
			System.out.println("Вы угадали c " + countOfAttempts + " попытки! Это число - " + randomNumber);
			isAlive = false;
		}
	}
}