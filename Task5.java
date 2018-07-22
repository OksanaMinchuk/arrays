package by.oksana.lesson4;

/*
Создайте массив из 15 случайных целых чисел из отрезка [0; 99].
Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */

public class Task5 {
    public static void main (String[] args) {
        int [] array = new int[15];
        int kol=0;

        for (int i=0; i<15; i++) {
            array[i] = (int)(Math.random()*100);
            if (array[i]%2 == 0 && array[i] != 0) {
                kol=kol+1;
            }
            System.out.println(array[i]);
        }

        System.out.println("Кол-во четных элементов - "+kol);
    }
}
