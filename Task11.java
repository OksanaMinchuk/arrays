package by.oksana.lesson4;

/*
Пользователь должен указать с клавиатуры положительное число,
а программа должна создать массив указанного размера из случайных целых чисел из [0;15]
и вывести его на экран в строку. После этого программа должна определить и сообщить пользователю о том,
сумма какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
Если пользователь введёт неподходящее число, то выдать соответствующее сообщение.
 */

import java.util.Scanner;

public class Task11 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка. Введите положительное число!");
        }

        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = (int)(Math.random()*15);
        }
        for (int elem: myArray) {
            System.out.printf("%3d", elem);
        }
        System.out.println("\n");

        int sum1 = 0;
        int sum2 = 0;
        if (n%2 ==0) {
            for (int i = 0; i < (n / 2); i++) {
                sum1 = sum1 + myArray[i];
            }
            for (int i = (n / 2); i <= n - 1; i++) {
                sum2 = sum2 + myArray[i];
            }
        } else if (n%2 != 0) {
            for (int i = 0; i < (n / 2); i++) {
                sum1 = sum1 + myArray[i];
            }
            for (int i = ((n / 2) + 1); i <= n - 1; i++) {
                sum2 = sum2 + myArray[i];
            }
            }

        if (sum1>sum2) {
            System.out.println("Сумма первой половины больше суммы второй половины "+sum1+" > "+sum2);
        } else if (sum1<sum2) {
            System.out.println("Сумма второй половины больше суммы первой половины "+sum2+" > "+sum1);
        } else
            System.out.println("Сумма равны "+sum2+" = "+sum1);

    }
}
