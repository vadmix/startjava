package com.startjava.lesson2.game;

import java.util.Scanner; // подключаем сканер

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private boolean isAlive;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		isAlive = true;
		randomNumber = (int) (Math.random() * 101);
		do {
			System.out.print(player1.getName() + ", введите предполагаемое число: ");
			player1.setGuessNumber(scan.nextInt());
			scan.nextLine();
			compareNumber(player1);
			if (isAlive) {
				System.out.print(player2.getName() + ", введите предполагаемое число: ");
				player2.setGuessNumber(scan.nextInt());
				scan.nextLine();
				compareNumber(player2);
			}
		} while (isAlive);
	}

	private void compareNumber(Player player) {
		if (player.getGuessNumber() > randomNumber) {
			System.out.println("Вы ввели число, которое больше того, которое загадал компьютер (" + randomNumber + ")");
		} else if (player.getGuessNumber() < randomNumber) {
			System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер (" + randomNumber + ")");
		} else {
			System.out.println(player.getName() + ", Вы угадали! Это число - " + player.getGuessNumber());
			isAlive = false;
		}
	}
}