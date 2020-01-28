import java.util.Scanner; // подключаем сканер

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Игрок №1, как тебя зовут?");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Игрок №2, как тебя зовут?");
		Player player2 = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber();
		game.play(player1, player2);
	}
}