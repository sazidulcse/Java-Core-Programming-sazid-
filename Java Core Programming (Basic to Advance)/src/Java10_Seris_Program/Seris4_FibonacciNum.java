package Java10_Seris_Program;

import java.util.Scanner;

public class Seris4_FibonacciNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many num: ");
        int n = input.nextInt();

        int fast= 0; 
        int scound =1; 
        int fibo; 
        //System.out.println(fast+"\n"+scound);
        for(int i =0; i<=n; i++){
            fibo =fast+scound;
            System.out.println(fibo);

            fast=scound;
            scound =fibo;


        }
        




    }
}
