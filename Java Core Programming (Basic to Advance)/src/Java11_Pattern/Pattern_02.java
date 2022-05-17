package Java11_Pattern;

import java.util.Scanner;

public class Pattern_02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("how many line : ");
        int n = input.nextInt();

        for(int row =n; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
System.out.println();
        }
    }
}
