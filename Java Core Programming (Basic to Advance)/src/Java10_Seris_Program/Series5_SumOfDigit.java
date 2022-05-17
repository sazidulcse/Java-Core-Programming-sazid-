package Java10_Seris_Program;

import java.util.Scanner;

public class Series5_SumOfDigit {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num= input.nextInt();
      int temp,sum=0, r; 
      temp=num;
      while (temp !=0) {
          r=num%10;
          sum =sum+r;
          temp = temp/10;
          
      }
      System.out.println(sum);
      
     
  }  
}
