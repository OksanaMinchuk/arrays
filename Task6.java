package by.oksana.lesson4;

/*
Создайте массив из 20 случайных целых чисел из отрезка [0;20].
Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке. 
 */

public class Task6 {
    public static void main (String[] args) {
        int [] array = new int[20];

        for (int i=0; i<20; i++) {
            array[i] = (int)(Math.random()*20);
        }

        for (int elem: array) {
            System.out.printf("%4d", elem);
        }

        for (int i=0; i<20; i++) {
            if (i%2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("\n");
        for (int elem: array) {
            System.out.printf("%4d", elem);
        }
    }
}
