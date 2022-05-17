package Java01_hello_world;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] []special_num;
        special_num = new int[2][3];

        special_num [0][0] = 100;
        special_num [0][1] = 200;
        special_num [0][2] = 300;
        special_num [1][0] = 400;
        special_num [1][1] = 500;
        special_num [1][2] = 600;

        for(int row =0; row<2; row++){
            for(int col = 0; col<3; col++){
                System.out.print("\t"+row+"row " +col+"col = "+special_num[row][col]);
            }
            System.out.println();
        }

        






       
    }
}
