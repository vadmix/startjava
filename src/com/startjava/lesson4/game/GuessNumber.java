package com.startjava.lesson4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		randomNumber = (int) (Math.random() * 101);
		System.out.println("У вас 10 попыток.");
		System.out.println("Компьютер загадал число " + randomNumber);
		for (int stepNumber = 1; stepNumber <= 10; stepNumber++) {
			player1.setCountOfAttempts(stepNumber);
			if (!makeMove(player1)) {
				break;
			}
			player2.setCountOfAttempts(stepNumber);
			if (!makeMove(player2)) {
				break;
			}
		}

		System.out.println(Arrays.toString(player1.getGuessNumbers()));
		System.out.println(Arrays.toString(player2.getGuessNumbers()));

		player1.cleanGuessNumbers();
		player2.cleanGuessNumbers();
		player1.setCountOfAttempts(0);
		player2.setCountOfAttempts(0);
	}

	private boolean makeMove(Player player) {
		inputNumber(player);
		if (!compareNumbers(player)) {
			if (player.getCountOfAttempts() == 10) {
				System.out.println("У " + player.getName() + " закончились попытки");
			}
			return true;
		} else return false;
	}

	private void inputNumber(Player player) {
		System.out.print(player.getName() + ", введите предполагаемое число: ");
		player.putGuessNumber(scan.nextInt());
		scan.nextLine();
	}

	private boolean compareNumbers(Player player) {
		if (player.getGuessNumber() > randomNumber) {
			System.out.println("Вы ввели число, которое больше того, которое загадал компьютер");
		} else if (player.getGuessNumber() < randomNumber) {
			System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер");
		} else {
			System.out.println(player.getName() + ", Вы угадали c " + player.getCountOfAttempts() + " попытки! Это число - " + randomNumber);
			return true;
		}
		return false;
	}
}