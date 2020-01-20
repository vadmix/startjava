public class MyFirstGame {
	public static void main(String[] args) {
		byte randomNumber = 89;
		int userNumber = 99;
		while (randomNumber != userNumber) {
			if (userNumber > randomNumber) {
				System.out.println("Вы ввели число, которое больше того, которое загадал компьютер (" + userNumber + ")");
				userNumber--;
			} else if (userNumber < randomNumber) {
				System.out.println("Вы ввели число, которое меньше того, которое загадал компьютер (" + userNumber + ")");
				userNumber++;
			}
		}
		System.out.println("Вы угадали, это число " + userNumber);
	}
}