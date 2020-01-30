import java.util.Scanner; // подключаем сканер

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Игрок №1, как тебя зовут?");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Игрок №2, как тебя зовут?");
		Player player2 = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber(player1, player2);
		String answer = "да";
		while (answer.equals("да")) {
			game.play();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scan.nextLine();
			} while (!((answer.equals("нет")) || (answer.equals("да"))));
			if (answer.equals("да")) {
				game = new GuessNumber(player1, player2);
			}
		}
	}
}