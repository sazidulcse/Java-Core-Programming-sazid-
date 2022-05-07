package Java05_Operator;

import java.util.Scanner;

public class Conditional_Operator_6 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
// init variable -------
       int num1 , num2;
       System.out.print("Enter Fast num : ");
       num1 =input.nextInt();
       System.out.print("Enter Scound Num : ");
       num2 = input.nextInt();
// use conditional operator or tarnary operator-----
//-if fast ex true then work 2nd ex but 1st ex false then work 3rd ex
       int large = (num1>num2)?num1:num2;
       // print statement
       System.out.println("the large num is : "+large);



       
   } 
}
