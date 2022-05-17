package Java12_Array;

import java.util.Scanner;

public class Array04_TowDeimontional2 {
    //2 ডায়মনশনাল অ্যারে
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] []Array = new int [2][3];
        Array [0][0]=10;
        Array [0][1]=20;
        Array [0][2]=30;
        Array [1][0]=10;
        Array [1][1]=10;
        Array [1][2]=10;

    
        for(int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                System.out.print(" "+Array[row][col]);

            }
            System.out.println();
        }






    }
}
