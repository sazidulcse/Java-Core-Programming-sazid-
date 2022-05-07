package Java11_Seris_Valu;
import java.util.Scanner;

public class Series2_squireroot {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
int m,n,sum=0;
System.out.print("Enter m ");
m= input.nextInt();
System.out.print("Enter n ");
n= input.nextInt();

for(int i=m; i<=n; i++){
System.out.println(i+"x"+i+"="+sum);

sum = sum +i*i;

}
System.out.println("the all sum is "+sum);



    }
}
