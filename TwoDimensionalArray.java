package by.oksana.lesson4;

public class TwoDimensionalArray {
    public static void main (String[] args) {
        int arr[][] = {
                {0,8,9},
                {5,0,6},
                {3,5,9}
        };

        for (int i = 0; i< 3; i++){
            for (int j =0; j <3; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        int n = 3;
        for (int i = 0; i< 3; i++){
            for (int j = n-i-1 ; j < n-i; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i< n; i++){
            for (int j = 0 ; j < n; j++) {
                if (j==n-i-1) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
