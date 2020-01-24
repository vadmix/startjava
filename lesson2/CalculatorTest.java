import java.util.Scanner; // подключаем сканер

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(scan.nextInt());
			scan.nextLine();
			System.out.print("Введите знак математической операции: ");
			calculator.setOperator(scan.nextLine().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(scan.nextInt());
			scan.nextLine();
			calculator.calculate ();
			String answer = "";
			while (!((answer.equals("нет")) || (answer.equals("да")))) {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scan.nextLine();
				if (answer.equals("нет")) {
					calculator.turnOff();
				}
				//System.out.println("Калькулятор включен? - " + calculator.isTurnedOn());
			}
		} while (calculator.isTurnedOn());
	}
}