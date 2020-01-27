import java.util.Scanner; // подключаем сканер

public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char operator;
	private boolean isTurnedOn;

	public Calculator() {
		isTurnedOn = true;
	}

	public boolean getIsTurnedOn() {
		return isTurnedOn;
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

	public int calculate() {
		Scanner scan = new Scanner(System.in);
		int result;
		String answer = "";
		do {
			System.out.print("Введите первое число: ");
			firstNumber = scan.nextInt();
			scan.nextLine();
			System.out.print("Введите знак математической операции: ");
			operator = scan.nextLine().charAt(0);
			System.out.print("Введите второе число: ");
			secondNumber = scan.nextInt();
			scan.nextLine();
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
			while (!((answer.equals("нет")) || (answer.equals("да")))) {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scan.nextLine();
				if (answer.equals("нет")) {
					turnOff();
				} else if (answer.equals("да")) {
					answer = "";
					break;
				}
			}
		} while (isTurnedOn);
		return result;
	}
}