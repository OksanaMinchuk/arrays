package by.oksana.lesson4;

/*
Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой
 */

import java.util.Scanner;

public class Task13 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты a,b,c : ax^2 + bx + c = 0 ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double x1;
        double x2;

        int d= b*b-4*a*c;

        if (d < 0) {
            System.out.println("Уравнение не имеет корней");
        } else if (d == 0) {
            x1=(double)(-b/(2*a));
            System.out.println("Уравнение имеет один корень = "+x1);
        } else if (d > 0) {
            x1=(double)((-b-Math.sqrt(d))/(2*a));
            x2=(double)((-b+Math.sqrt(d))/(2*a));
            System.out.println("Уравнение имеет два корня х1 = "+x1+" и х = "+x2);
        }

    }
}
