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

	public int calculate() {
		int result;
		switch (this.getOperator()) {
			case '+':
				System.out.println("Складываем");
				result = this.addition();
				System.out.println(firstNumber + "+" + secondNumber + "=" + result);
				break;
			case '-':
				System.out.println("Вычитаем");
				result = this.subtraction();
				System.out.println(firstNumber + "-" + secondNumber + "=" + result);
				break;
			case '*':
				System.out.println("Умножаем");
				result = this.multiplication();
				System.out.println(firstNumber + "*" + secondNumber + "=" + result);
				break;
			case '/':
				System.out.println("Делим");
				result = this.division();
				System.out.println(firstNumber + "/" + secondNumber + "=" + result);
				break;
			case '%':
				System.out.println("Находим остаток от деления");
				result = this.modulo();
				System.out.println(firstNumber + "%" + secondNumber + "=" + result);
				break;
			case '^':
				System.out.println("Возводим в степень");
				result = this.power();
				System.out.println(firstNumber + "^" + secondNumber + "=" + result);
				break;
			default:
				System.out.println("Выбрана неверная операция");
				result = 0;
				break;
		}
		return result;
	}
}