public class Calculator {
    public static void main(String[] args) {
    	int firstNumber = 3;
    	int secondNumber = 3;
    	char operator = '+';
    	if (operator == '+') {
    		System.out.println ("Складываем");
    		System.out.println (firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
    	} else if (operator == '-') {
    		System.out.println ("Вычитаем");
    		System.out.println (firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
    	} else if (operator == '*') {
    		System.out.println ("Умножаем");
    		System.out.println (firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
    	} else if (operator == '/') {
    		System.out.println ("Делим");
    		System.out.println (firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
    	} else if (operator == '%') {
    		System.out.println ("Находим остаток от деления");
    		System.out.println (firstNumber + "%" + secondNumber + "=" + (firstNumber % secondNumber));
    	} else if (operator == '^') {
    		int res = 1;
    		System.out.println ("Возводим в степень");
    		System.out.print (firstNumber + "^" + secondNumber + "=");
    		for (int i = 0;i < secondNumber;i++) {
    			res *= firstNumber;
    		}
    		System.out.print (res);
    		System.out.println ();
    	}
    }
}