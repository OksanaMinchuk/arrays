package by.oksana.lesson4;

/*
Создайте массив из 4 случайных целых чисел из отрезка [0;10],
выведите его на экран в строку. Определить и вывести на экран сообщение о том,
является ли массив строго возрастающей последовательностью. 
 */

public class Task8 {
    public static void main (String[] args) {
        int [] array = new int[4];
        int k = 0;


        for (int i=0; i<4; i++) {
            array[i] = (int)(Math.random()*10);
        }

        for (int elem: array) {
            System.out.printf("%4d", elem);
        }
        System.out.println("\n");

        for (int i = 0; i < 4-1; i++) {
            if (array[i] < array[i+1]) {
                k = k+1;
            }
        }

        if (k==3) {
            System.out.println("Возрастающая последовательность");
        } else
            System.out.println("Не возрастающая последовательность");
    }
}
