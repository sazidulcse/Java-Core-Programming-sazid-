package Java05_Operator;
import java.util.Scanner;
public class Arithmetic_Operator_1 {
   public static void main(String[] args) {
// Init input Scanner Class 
    Scanner input = new Scanner(System.in);
    
    // init varibale 
    int num1, num2; 
//input valu 
System.out.print("Enter fast number: ");
num1 = input.nextInt();
System.out.print("Enter scound number: ");
num2 = input.nextInt();

//Arithmetic Operation 
//sum
int sum = num1 +num2;
System.out.println(num1+"+"+num2+"="+sum);

//subscription
int sub = num1 -num2;
System.out.println(num1+"-"+num2+"="+sub);

//multipication
int mul = num1 *num2;
System.out.println(num1+"x"+num2+"="+mul);

//division
int div = num1 /num2;
System.out.println(num1+"/"+num2+"="+div);

//modulus funtion
int remainder = num1 %num2;
System.out.println(num1+"%"+num2+"="+remainder);













       
   } 
}
