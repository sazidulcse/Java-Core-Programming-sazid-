package Java01_hello_world;

import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
       int number,m , count=0,tolalnum=0;
       Scanner input= new Scanner (System.in);
       System.out.print(" num :");
       number=input.nextInt();
       
       for(int i =2; i<number; i++){
           if(number%i==0){
               count++;
               break;

           }
       }
       if(count==0){
           System.out.println("prime num");
       }else{
           System.out.println("not a prime");
       }
      
    }
    
}
