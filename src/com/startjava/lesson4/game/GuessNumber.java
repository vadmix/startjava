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
		do {
			countOfAttempts++;
			System.out.print(player1.getName() + ", введите предполагаемое число: ");
			player1.putGuessNumber(scan.nextInt(), countOfAttempts-1);
			scan.nextLine();
			compareNumber(player1);
			if (isAlive) {
				System.out.print(player2.getName() + ", введите предполагаемое число: ");
				player2.putGuessNumber(scan.nextInt(), countOfAttempts-1);
				scan.nextLine();
				compareNumber(player2);
			}
		} while (isAlive && (countOfAttempts < 10));
		int[] copyOfGuessNumbers1 = Arrays.copyOf(player1.getGuessNumbers(), countOfAttempts);
		int[] copyOfGuessNumbers2;
		if (randomNumber == player1.getGuessNumber(countOfAttempts-1)) {
			copyOfGuessNumbers2 = Arrays.copyOf(player2.getGuessNumbers(), countOfAttempts - 1);
		} else {
			copyOfGuessNumbers2 = Arrays.copyOf(player2.getGuessNumbers(), countOfAttempts);
		}
		System.out.println(Arrays.toString(copyOfGuessNumbers1));
		System.out.println(Arrays.toString(copyOfGuessNumbers2));
	}

	private void compareNumber(Player player) {
		if (player.getGuessNumber(countOfAttempts-1) > randomNumber) {
			System.out.println("Вы ввели число, которое больше того, которое загадал компьютер (" + randomNumber + ")");
		} else if (player.getGuessNumber(countOfAttempts-1) < randomNumber) {
			System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер (" + randomNumber + ")");
		} else {
			System.out.println(player.getName() + ", Вы угадали c " + countOfAttempts + " попытки! Это число - " + player.getGuessNumber(countOfAttempts-1));
			isAlive = false;
		}
		if (isAlive) {
			if (countOfAttempts == 10) {
				System.out.println("У " + player.getName()  + " закончились попытки");
			}
		}
	}
}