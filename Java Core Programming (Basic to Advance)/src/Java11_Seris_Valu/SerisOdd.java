package Java11_Seris_Valu;
import java.util.Scanner;

public class SerisOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Initial num: ");
        int m = input.nextInt();
        System.out.println("Enter Ending num: ");
        int n = input.nextInt();
        int sum =0; 

        for(int i=m; i<=n; i++){
            if(i%2==0)
            sum = sum +i;

System.out.println(i);




        }

System.out.println(sum);


    }
    
}
