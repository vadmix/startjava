package com.startjava.lesson4.game;

public class Player {
	private String name;
	private int guessNumber;
	private int[] guessNumbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setGuessNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}

	public int getGuessNumber() {
		return guessNumber;
	}

	public int getGuessNumber(int numberOfCell) {
		return guessNumbers[numberOfCell];
	}
	public void putGuessNumber(int guessNumber, int numberOfCell) {
		guessNumbers[numberOfCell] = guessNumber;
	}

	public int[] getGuessNumbers() {
		return guessNumbers;
	}


}