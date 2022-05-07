package Java05_Operator;

public class Unary_Operator_3 {
    public static void main(String[] args) {
        //Init variable
        int x = 17;
        int y;
        int result; 
        
        //Unary Plus Minus programe
        //conditon (++=+ , --=+, +-=- ,-+ =-)
        //Unary + - Operation 
        result = +x;
        // x original valu 17 & then ( positive x & +x = positve x )
        System.out.println("x = "+result);

        result = -x;
        // x last valu positive x & then (positve x  & -x  = neg x)
        System.out.println("x ="+result);


       /*
        //Incriment  ++  [Prefix and postfix incriment]
        //pro incrment 
        y = x++;
        // x original valu 17 and no more x  so not change x valu  
        System.out.println("y = "+y);       //17
        y = x;  
        System.out.println("y ="+y);        //18

        //pre increment 
        y = ++x;
        System.out.println("y = "+y);
        y =x; 
        System.out.println(y);
        */
// Decriment  -- [Prefix and postfix Decriment]
        //pro incrment 
        y = x--;
        // x original valu 17 and no more x  so not change x valu  
        System.out.println("y = "+y);       //17
        y = x;  
        System.out.println("y ="+y);        //16

        //pre increment 
        y = --x;
        System.out.println("y = "+y); //15
        y =x; 


    
        
    }
}
