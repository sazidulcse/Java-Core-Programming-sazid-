package Java10_Seris_Program;

import java.util.Scanner;

public class Series_mulPrime {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter initial num: ");
      int m = input.nextInt();
      System.out.print("Enter ending num: ");
      int n = input.nextInt();
      int count =0;
      int totalnum=0;

     for(int i=m; i<=n; i++){
         for(int j=2; j<=i-1; j++){ // akhane j valu 2 theke i valu -1 
             if(i%j==0){ // i div j ==jodi 0 hoi {j valu is i valu -1} 
                 count++;
                 break;
             }

         }

         if(count==0){
             System.out.println(i);
             totalnum ++;
         }
         count =0;
     }
System.out.println("total prime num = "+totalnum);

  } 

}
