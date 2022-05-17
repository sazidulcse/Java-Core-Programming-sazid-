package Java12_Array;

import java.util.Scanner;

public class Array02_OneDeimontional2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double[] number = new double[5];
        for (int i = 0; i < number.length; i++) {
            System.out.print(i + "st index valu = ");
            number[i] = input.nextDouble();
        }

        // sum = number[0]+number[1]+number[2]+number[3]+number[4];
        for (int i = 0; i < number.length; i++) {

            sum = sum + number[i];

        }
        double avg = sum / number.length;
        System.out.println("the sum is " + sum);
        System.out.println("average is = " + avg);

    }
}
