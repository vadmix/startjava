import java.util.Scanner; // подключаем сканер

public class ConditionalStatement {
	public static void main (String[] args) {
		//Запрос в консоли сведений о человеке
		Scanner scan = new Scanner(System.in);
		System.out.println("Укажите Ваше имя:");
		String firstName = scan.nextLine();
		System.out.println("Укажите Ваш возраст:");
		int age = 0;
		while (!scan.hasNextInt()) {
			System.out.println("Извините, но это явно не возраст. Попробуйте снова!");
			scan.nextLine();
			System.out.println("Укажите Ваш возраст:");
		}
		age = scan.nextInt();
		scan.nextLine();
		System.out.println("Укажите Ваш рост:");
		float height = 0f;
		while (!scan.hasNextFloat()) {
			System.out.println("Извините, но это явно не рост. Попробуйте снова!");
			scan.nextLine();
			System.out.println("Укажите Ваш рост:");
		}
		height = scan.nextFloat();
		scan.nextLine();
		System.out.println("Вы мужского пола? Если да, введите \"Y\", иначе введите, что хотите");
		boolean isMale = false;
		if (scan.nextLine().charAt(0) == 'Y') {
			isMale = true;
		} else {
			isMale = false;
		}

		//Вывод в консоль характеристик человека
		if (age > 20) {
			System.out.println("Вам уже больше двадцати...Пора бы определиться с профессией!");
		}
		if (isMale) {
			System.out.println("Сейчас наблюдается кадровый дефицит в сфере монтажа потолочных конструкций. Вы - мужчина, и точно справитесь с этой работой!");
		}
		if (!isMale) {
			System.out.println("Сейчас на рынке труда наблюдается спрос на стюардесс. Похоже, эта профессия для Вас!");
		}
		if (height >1.80f) {
			System.out.println("С таким большим ростом Вас точно возьмут!");
		} else {
			System.out.println("Рост, конечно, является плюсом в данной профессии, но это - не самое главное!");
		}
		char firstChar = firstName.charAt(0);
		if (firstChar == 'M') {
			System.out.println("Ваше имя, как и имя директора, начинается на букву М. Возможно, это сыграет Вам на руку!");
		} else if (firstChar == 'I') {
			System.out.println("Ваше имя, как и имя учредителя, начинается на букву I. Возможно, это сыграет Вам на руку!");
		} else {
			System.out.println("В компании я не знаю никого, чье имя начиналось бы на букву " + firstChar + ". Но в этом нет ничего плохого.");
		}
	}
}