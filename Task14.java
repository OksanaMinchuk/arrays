package by.oksana.lesson4;

/*
Проверить, различны ли все элементы массива. 
 */

public class Task14 {
    public static void main (String[] args) {
        int [] array = new int[10];

        for (int i=0; i<10; i++) {
            array[i] = (int)(Math.random()*15);
        }

        for (int elem: array) {
            System.out.printf("%4d", elem);
        }
        System.out.println("\n");

        int k = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Есть одинаковые элементы");
                }
            } break;
        }
    }
}
