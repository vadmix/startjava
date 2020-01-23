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

			switch (calculator.getOperator()) {
				case '+':
					System.out.println("Складываем");
					System.out.println(calculator.getFirstNumber() + "+" + calculator.getSecondNumber() + "=" + calculator.addition());
					break;
				case '-':
					System.out.println("Вычитаем");
					System.out.println(calculator.getFirstNumber() + "-" + calculator.getSecondNumber() + "=" + calculator.subtraction());
					break;
				case '*':
					System.out.println("Умножаем");
					System.out.println(calculator.getFirstNumber() + "*" + calculator.getSecondNumber() + "=" + calculator.multiplication());
					break;
				case '/':
					System.out.println("Делим");
					System.out.println(calculator.getFirstNumber() + "/" + calculator.getSecondNumber() + "=" + calculator.division());
					break;
				case '%':
					System.out.println("Находим остаток от деления");
					System.out.println(calculator.getFirstNumber() + "%" + calculator.getSecondNumber() + "=" + calculator.modulo());
					break;
				case '^':
					System.out.println("Возводим в степень");
					System.out.println(calculator.getFirstNumber() + "^" + calculator.getSecondNumber() + "=" + calculator.power());
					break;
			}
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