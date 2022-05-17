package Java12_Array;

import java.util.Scanner;

public class Array03_TwoDeimontional {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int sum =0; 
      int [] ArrayNum = new int [5];
      for(int i=0; i<ArrayNum.length; i++){
          System.out.print("input "+i+"index valu :");
          ArrayNum[i]=input.nextInt();
      }
      for(int i=0; i<ArrayNum.length; i++){
sum= sum+ArrayNum[i];
      }
int max=ArrayNum[0];
int min=ArrayNum[0];

      for(int i=0; i<5; i++){
          if(max<ArrayNum[i]){
              max= ArrayNum[i];
          }
          if(min>ArrayNum[i]){
            min= ArrayNum[i];
        }
      }
      int avg= sum/ArrayNum.length;
    System.out.println("Array Total Valu : "+sum);
    System.out.println("Array max ="+max);
    System.out.println("Array min ="+min);
    System.out.println("array avg valu : "+avg);

   } 
}
 