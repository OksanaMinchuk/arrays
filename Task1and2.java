package by.oksana.lesson4;

/* Напишите программу вывода всех четных чисел от 2 до 100 включительно.
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99.
 */

public class Task1and2 {
    public static void main (String[] args) {
        int x = 0;
        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }

        int y = 0;
        int sum = 0;
        while (y < 100) {
            if (y % 2 != 0) {
                sum = sum + y;
            }
            y++;
        }
        System.out.println("сумма "+sum);
    }
}
