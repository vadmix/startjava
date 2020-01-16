import java.util.Scanner; // подключаем сканер

public class ConditionalStatement {
    public static void main (String[] args) {
        //Объявление переменных
        byte age = 0;
        float height = 0f;
        String firstName = new String();
        boolean isMale = false;

        //Запрос в консоли сведений о человеке
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Укажите Ваше имя: ");
        firstName = inputValue.nextLine();
        System.out.println("Укажите Ваш возраст: ");
        while (inputValue.hasNextByte() == false) {
            System.out.println("Извините, но это явно не возраст. Попробуйте снова!");
            inputValue.nextLine();
            System.out.println("Укажите Ваш возраст: ");
        }
        age = inputValue.nextByte();
        inputValue.nextLine();
        System.out.println("Укажите Ваш рост: ");
        while (inputValue.hasNextFloat() == false) {
            System.out.println("Извините, но это явно не рост. Попробуйте снова!");
            inputValue.nextLine();
            System.out.println("Укажите Ваш рост: ");
        }
        height = inputValue.nextFloat();
        inputValue.nextLine();
        System.out.println("Вы мужского пола? Если да, введите \"Y\", иначе введите, что хотите");
        if (inputValue.nextLine().charAt(0) == 'Y') {
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
        if (isMale == false) {
            System.out.println("Сейчас на рынке труда наблюдается спрос на стюардесс. Похоже, эта профессия для Вас!");
        }
        if (height >1.80f) {
            System.out.println("С таким большим ростом Вас точно возьмут!");
        } else {
            System.out.println("Рост, конечно, является плюсом в данной профессии, но это - не самое главное!");
        }
        if (firstName.charAt(0) == 'M') {
            System.out.println("Ваше имя, как и имя директора, начинается на букву М. Возможно, это сыграет Вам на руку!");
        } else if (firstName.charAt(0) == 'I') {
            System.out.println("Ваше имя, как и имя учредителя, начинается на букву I. Возможно, это сыграет Вам на руку!");
        } else {
            System.out.println("В компании я не знаю никого, чье имя начиналось бы на букву " + firstName.charAt (0) +". Но в этом нет ничего плохого.");
        }
    }
}