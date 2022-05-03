package Java5_Operator;

import java.util.Scanner;

public class Logical_Operator_5 {
    public static void main(String[] args) {
        /*Logical Operator Simbol 
        Logical AND [ &&] all  valu true  = true other wish false 
        Logical OR [|| ]  any one valu true = true
        Logical NOT [!]
        */

        Scanner input = new Scanner(System.in);
        char c; 
        System.out.println("Type one lettter :");
        c = input.nextLine().charAt(0);
        //use logical OR 
        if(c=='a' || c =='e' || c =='i' ||c=='o' || c=='u'){
            System.out.println("vawel");
        }
        else{
            System.out.println("consonant");
        }

        // Logical And 

        if(c>='a' && c<='z'){
            System.out.println("small latter");
        }
        else if(c>='A'&& c<='Z') {
            System.out.println("Big letter");
        }
        else{
            System.out.println("not a letter");
        }




    }
    
}
