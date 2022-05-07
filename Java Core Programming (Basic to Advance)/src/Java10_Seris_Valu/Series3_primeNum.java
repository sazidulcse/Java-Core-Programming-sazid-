package Java10_Seris_Valu;

import java.util.Scanner;

public class Series3_primeNum {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int num , count=0; 
      System.out.print("Enter integer num: ");
      num= input.nextInt();
      for(int i=2; i<num; i++){
         

    if(num%i==0){ //num div i== 0
        count++;
        break;
        
    }
    
      }
      
      if(count==0){
          System.out.println("this is prime num ");
        
      }
      else{
          System.out.println("this is not a prime number");
      }

    
        }
       


    }
    

