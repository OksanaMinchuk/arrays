package by.oksana.lesson4;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению
элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
Вывести все три массива на экран (каждый на отдельной строке),
затем вывести количество целых элементов в третьем массиве.
 */

public class Task10 {
    public static void main (String[] args) {
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        double [] array3 = new double[10];
        int k = 0;

        for (int i=0; i<10; i++) {
            array1[i] = (int)(Math.random()*9);
            array2[i] = 1+(int)(Math.random()*9);
            double tempValue = ((double) array1[i])/array2[i];
            array3[i] = ((int) (tempValue*100))/100.0;
        }

        for (int elem: array1) {
            System.out.printf("%4d", elem);
        }
        System.out.println("\n");

        for (int elem: array2) {
            System.out.printf("%4d", elem);
        }
        System.out.println("\n");

        for (int i=0; i<=array3.length-1; i++) {
            System.out.print(array3[i]+"  ");
        }
        System.out.println("\n");

        int kol=0;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 1 == 0) {
                kol=kol+1;
            }
        }
        System.out.println("Количество целых чисел = "+kol);
    }
}
