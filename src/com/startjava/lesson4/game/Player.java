package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] guessNumbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int getGuessNumber(int index) {
		return guessNumbers[index];
	}

	public void putGuessNumber(int guessNumber, int index) {
		guessNumbers[index] = guessNumber;
	}

	public void cleanGuessNumber() {
		Arrays.fill(guessNumbers, 0);
	}

	public int[] getGuessNumbers(int length) {
		return Arrays.copyOf(guessNumbers, length);
	}


}