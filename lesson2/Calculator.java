public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char operator;
	private boolean isTurnedOn;

	public Calculator() {
		isTurnedOn = true;
	}

	public boolean isTurnedOn() {
		if (isTurnedOn) {
			return true;
		} else {
			return false;
		}
	}

	public void turnOff(){
		isTurnedOn = false;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public int addition() {
		return firstNumber + secondNumber;
	}

	public int subtraction() {
		return firstNumber - secondNumber;
	}

	public int multiplication() {
		return firstNumber * secondNumber;
	}

	public int division() {
		return firstNumber / secondNumber;
	}

	public int modulo() {
		return firstNumber % secondNumber;
	}

	public int power() {
		int result = 1;
		for (int i = 0; i < secondNumber; i++) {
			result *= firstNumber;
		}
		return result;
	}
}