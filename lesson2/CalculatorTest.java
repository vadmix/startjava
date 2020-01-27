import java.util.Scanner; // подключаем сканер

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(scan.nextInt());
			scan.nextLine();
			System.out.print("Введите знак математической операции: ");
			calculator.setOperator(scan.nextLine().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(scan.nextInt());
			scan.nextLine();
			calculator.calculate();
			while (!((answer.equals("нет")) || (answer.equals("да")))) {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scan.nextLine();
				if (answer.equals("да")) {
					answer = "";
					break;
				}
			}
		} while (!answer.equals("нет"));
	}
}