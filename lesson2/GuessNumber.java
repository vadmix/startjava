import java.util.Scanner; // подключаем сканер

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private boolean isAlive;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		randomNumber = (int) (Math.random() * 101);
		isAlive = true;
	}

	public void play() {
		do {
			check (player1);
			if (isAlive) {
				check (player2);
			}
		} while (isAlive);
	}

	private void check(Player player) {
		System.out.println(player.getName() + ", введите предполагаемое число:");
		player.setGuessNumber(scan.nextInt());
		scan.nextLine();
		if (player.getGuessNumber() > randomNumber) {
			System.out.println("Вы ввели число, которое больше того, которое загадал компьютер (" + randomNumber + ")");
		} else if (player.getGuessNumber() < randomNumber) {
			System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер (" + randomNumber + ")");
		} else {
			System.out.println(player.getName() + ", Вы угадали! Это число - " + player.getGuessNumber());
			isAlive = false;
		}
	}
}