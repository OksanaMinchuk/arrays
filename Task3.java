package by.oksana.lesson4;

/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.
 */

public class Task3 {
    public static void main (String[] args) {
        int x = 2;
        int n = 0;

        while (x <= 20) {
            if (x%2 == 0) {
                n = n + 1;
            }
            x++;
        }

        int [] array = new int[n];

        x=2;
        for (int i = 0; i < n; i++) {
            if (x%2 == 0){
                array[i] = x;
                x=x+2;
            }
        }
        for (int elem: array) {
            System.out.printf("%4d", elem);
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

    }
}
