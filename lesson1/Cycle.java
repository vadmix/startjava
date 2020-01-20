public class Cycle {
    public static void main (String[] args){
    	//Выводим числа от 0 до 20
    	for (int i = 0; i <= 20; i++) {
    		System.out.print(i);
    		if (i < 20) {
    			System.out.print(" ");
    		}
    	}
    	System.out.println();

    	//Выводм числа от 6 до -6 с шагом 2
    	int j = 6;
    	while (j >= -6) {
    		System.out.print(j);
    		if (j >= -6) {
    			System.out.print(" ");
    		}
    		j -= 2;
    	}
    	System.out.println();

    	//Выводим сумму нечетных чилел от 10 до 20 (а также для удобства промежуточные результаты)
    	int k = 10;
    	int sum = 0;
    	do {
    		if (k % 2 != 0) {
    			sum += k;
    			System.out.println(k + " - нечетное число. Просуммируем его. Нарастающий итог: " + sum);
    		} else {
    			System.out.println(k + " - четное число. Пропускаем.");
    		}
    		k++;
    	} while (k <= 20);
    	System.out.println("Сумма всех нечетных чисел от 10 до 20 равна " + sum);
    }
}