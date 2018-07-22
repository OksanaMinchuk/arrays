package by.oksana.lesson4;

/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */

public class Task4 {
    public static void main (String[] args) {
        int x = 1;
        int n = 0;

        while (x <= 99) {
            if (x%2 != 0) {
                n = n + 1;
            }
            x++;
        }

        int [] array = new int[n];

        x=1;
        for (int i = 0; i < n; i++) {
            if (x%2 != 0){
                array[i] = x;
                x=x+2;
            }
        }

        // вывод по возрастанию в строку
        for (int elem: array) {
            System.out.printf("%4d", elem);
        }

        System.out.println("\n");

/*        //переворот массива
        for (int i = 0; i < n/2; i++) {
            int k = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = k;
        }
*/
        for (int i=n-1; i>=0; i--) {
            System.out.print(array[i]+" ");
        }

    }
}
