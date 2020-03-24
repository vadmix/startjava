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

	public int getGuessNumber(int index) {
		return guessNumbers[index];
	}

	public void putGuessNumber(int guessNumber, int index) {
		guessNumbers[index] = guessNumber;
	}

	public void cleanGuessNumbers() {
		Arrays.fill(guessNumbers, 0, countOfAttempts, 0);
	}

	public int[] getGuessNumbers() {
		return Arrays.copyOf(guessNumbers, countOfAttempts);
	}

	}