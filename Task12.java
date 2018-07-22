package by.oksana.lesson4;

/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

import java.util.Scanner;

public class Task12 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве больше 3");
        int n = in.nextInt();

        if (n <= 3) {
            System.out.println("Ошибка. Введите число больше 3!");
        }
        int [] array = new int[n];
        int kol=0;

        for (int i=0; i<n; i++) {
            array[i] = (int)(Math.random()*n);
            if (array[i]%2 == 0 && array[i] != 0) {
                kol=kol+1;
            }
            System.out.print(array[i]+"  ");
        }

        int [] array2 = new int[kol];

 /*       for (int i=0; i<n; i++) {
            if (array[i]%2 == 0 && array[i] != 0) {
                 array2[kol-1] = array[i];
                 kol--;
            }
        } */

        for (int i=n-1; i>=0; i--) {
            if (array[i]%2 == 0 && array[i] != 0) {
                array2[kol-1] = array[i];
                kol--;
            }
        }
        System.out.println("\n");
        for (int elem: array2) {
            System.out.printf("%3d", elem);
        }
    }
}
