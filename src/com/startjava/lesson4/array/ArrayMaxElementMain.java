package com.startjava.lesson4.array;


import java.util.Scanner;

public class ArrayMaxElementMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] numbers = new int[scanner.nextInt()];
        System.out.println("Заполните массив целыми числами через пробел: ");
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("Максимальное число = " + max);
    }
}