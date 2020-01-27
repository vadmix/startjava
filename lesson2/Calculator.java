public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char operator;

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

	public int calculate() {
		int result;
		switch (operator) {
			case '+':
				System.out.println("Складываем");
				result = firstNumber + secondNumber;
				System.out.println(firstNumber + "+" + secondNumber + "=" + result);
				break;
			case '-':
				System.out.println("Вычитаем");
				result = firstNumber - secondNumber;
				System.out.println(firstNumber + "-" + secondNumber + "=" + result);
				break;
			case '*':
				System.out.println("Умножаем");
				result = firstNumber * secondNumber;
				System.out.println(firstNumber + "*" + secondNumber + "=" + result);
				break;
			case '/':
				System.out.println("Делим");
				result = firstNumber / secondNumber;
				System.out.println(firstNumber + "/" + secondNumber + "=" + result);
				break;
			case '%':
				System.out.println("Находим остаток от деления");
				result = firstNumber % secondNumber;
				System.out.println(firstNumber + "%" + secondNumber + "=" + result);
				break;
			case '^':
				System.out.println("Возводим в степень");
				result = 1;
				for (int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
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