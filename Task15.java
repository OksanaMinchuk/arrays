package by.oksana.lesson4;

/*
Найти максимальный элемент в массиве и поменять его местами с нулевым элементом 
 */

import java.util.Scanner;

public class Task15 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка. Введите положительное число!");
        }

        int [] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = (int)(Math.random()*15);
        }

        for (int elem: array) {
            System.out.printf("%4d", elem);
        }
        System.out.println("\n");

        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            int value = array[i];
            if (value > max) {
                maxIndex = i;
            }
        }

        int a = array[maxIndex];
        array[maxIndex]=array[0];
        array[0]=a;

        for (int elem: array) {
            System.out.printf("%4d", elem);
        }
    }
}
