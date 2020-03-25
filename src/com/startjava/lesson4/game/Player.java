package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] guessNumbers = new int[10];
	private int countOfAttempts;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCountOfAttempts(int countOfAttempts) {
		this.countOfAttempts = countOfAttempts;
	}

	public int getCountOfAttempts() {
		return countOfAttempts;
	}

	public int getGuessNumber() {
		return guessNumbers[countOfAttempts - 1];
	}

	public void putGuessNumber(int guessNumber) {
		guessNumbers[countOfAttempts - 1] = guessNumber;
	}

	public void cleanGuessNumbers() {
		Arrays.fill(guessNumbers, 0, countOfAttempts, 0);
	}

	public int[] getGuessNumbers() {
		return Arrays.copyOf(guessNumbers, countOfAttempts);
	}
}