package by.oksana.lesson4;

/*
оздайте массив из 12 случайных целых чисел из отрезка [0;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */

public class Task9 {
    public static void main (String[] args) {
        int [] array = new int[12];

        for (int i=0; i<12; i++) {
            array[i] = (int)(Math.random()*15);
        }

        for (int elem: array) {
            System.out.printf("%4d", elem);
        }
        System.out.println("\n");

        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < 12; i++) {
            int value = array[i];
            if (value > max) {
                maxIndex = i;
            }
        }
            System.out.println("Максимальное число "+array[maxIndex]+" с индексом "+maxIndex);
    }
}
