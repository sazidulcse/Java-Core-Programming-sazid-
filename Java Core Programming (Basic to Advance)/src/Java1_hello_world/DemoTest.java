package Java1_hello_world;

import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
       int n,m , count=0,j,tolalnum=0;
       Scanner input= new Scanner (System.in);
       m=input.nextInt();
       System.out.print("last num ");
       n= input.nextInt();

       for(int i=m; i<=n; i++){
           for(j=2; j<=i-1;j++){
               if(i%j==0){
                   count ++;
                   break;
               }
            }
            if(count==0){
                System.out.println(i);
                tolalnum ++; 
                
            }
            count=0;
       }
       System.out.println(tolalnum);
    }
    
}
