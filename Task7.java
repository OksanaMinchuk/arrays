package by.oksana.lesson4;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый, выведите массивы на экран в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны). 
 */

public class Task7 {
    public static void main (String[] args) {
        int [] array1 = new int[5];
        int [] array2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double sred1 = 0;
        double sred2 = 0;

        for (int i=0; i<5; i++) {
            array1[i] = (int)(Math.random()*15);
            array2[i] = (int)(Math.random()*15);
        }

        for (int elem: array1) {
            System.out.printf("%4d", elem);
        }
        System.out.println("\n");
        for (int elem: array2) {
            System.out.printf("%4d", elem);
        }

        for (int i=0; i < 5; i++) {
            sum1=array1[i]+sum1;
            sum2=array2[i]+sum2;
        }

        sred1 = (double)(sum1/5);
        sred2 = (double)(sum2/5);

        if (sred1 > sred2) {
            System.out.println("\n Среднее значение 1-го массива больше");
        } else if (sred1 < sred2) {
            System.out.println("\n Среднее значение 2-го массива больше");
        } else
            System.out.println("\n Средние значения равны");

        System.out.println("Среднее значение 1-го массива "+sred1);
        System.out.println("Среднее значение 2-го массива "+sred2);
    }
}
