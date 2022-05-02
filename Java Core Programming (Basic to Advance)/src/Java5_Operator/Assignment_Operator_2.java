package Java5_Operator;

public class Assignment_Operator_2 {
    public static void main(String[] args) {
        //intit variable 
        int x, y;
        x =32;
        y = 21;
//Assignment Operation 
  // x original valu 32 so when assign y then x +y =53
  x +=y; 
  System.out.println("x ="+x);
  // x last valu 53 so when assign y then x(53) - y(21) =32
  x -=y;
  System.out.println("x ="+x);
  // x last valu 32 so when assign y then x(32)*y(21) =672
  x *=y;
  System.out.println("x ="+x);
  // x last valu 672 so when assign y then x(672)/y(21) =32
  x /=y;
  System.out.println("x ="+x);
  // x last valu 32 so when assign y then x(32)%y(21) =11
  x %=y;
  System.out.println("x ="+x);




        
    }
}
