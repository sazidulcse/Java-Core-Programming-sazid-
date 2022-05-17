package Java12_Array;

import java.util.Scanner;

public class Array05_InputMatrixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        // init array variable
        int[][] matrix1;
        matrix1 = new int[2][3];
        int matrix2[][] = new int[2][3];

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Matrix 1 [%d][%d]= ", row, col);
                matrix1[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Matrix 2 [%d][%d]= ", row, col);
                matrix2[row][col] = input.nextInt();
            }
        }

        // print matrix{}
        System.out.println("Matrix 1 =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + matrix1[row][col]);
            }
            System.out.println("");

        }
        System.out.println("\n\n ");

        System.out.println("Matrix 2 =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + matrix2[row][col]);
            }
            System.out.println("\n");

        }
        System.out.println("AB= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                int AB[][] = new int[2][3];

                AB[row][col] = matrix1[row][col] + matrix2[row][col];
                System.out.print("\t" + AB[row][col]);

            }
            System.out.println();

        }

    }
}
