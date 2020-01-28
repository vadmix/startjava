import java.util.Scanner; // подключаем сканер

public class GuessNumber {
		private int randomNumber;
		private Player winner = null;
		private boolean isAlive;

		public GuessNumber() {
			randomNumber = (int) (Math.random() * 100);
			isAlive = true;
		}

		private void check(Player player) {
			Scanner scan = new Scanner(System.in);
			System.out.println(player.getName() + ", введите предполагаемое число:");
			player.setGuessNumber(scan.nextInt());
			scan.nextLine();
			if (player.getGuessNumber() > randomNumber) {
					System.out.println("Вы ввели число, которое больше того, которое загадал компьютер (" + randomNumber + ")");
				} else if (player.getGuessNumber() < randomNumber) {
					System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер (" + randomNumber + ")");
				} else {
					System.out.println(player.getName() + ", Вы угадали! Это число - " + player.getGuessNumber());
					winner = player;
				}
		}

		public void play(Player player1, Player player2) {
			Scanner scan = new Scanner(System.in);
			String answer = "";
			int playerNumber = 1;
			int changer = 1;
			
			do {
				switch (playerNumber) {
					case 1:
						check (player1);
						break;
					case 2:
						check (player2);
						break;
				}
				if (winner != null) {
					while (!((answer.equals("нет")) || (answer.equals("да")))) {
						System.out.print("Хотите продолжить? Право первого хода предоставляется победителю! [да/нет]: ");
						answer = scan.nextLine();
						if (answer.equals("нет")) {
							isAlive = false;
						} else if (answer.equals("да")) {
							winner = null;
							randomNumber = (int) (Math.random() * 100);
							answer = "";
							break; // Выходим из цикла, чтобы не проверять answer (иначе попадем в бесконечный цикл)
						}
					}
				} else {
					playerNumber = playerNumber + changer;
					changer = changer * -1;
				}
			} while (isAlive);
		}

		
	
}