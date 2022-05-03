package Java6_if_elseControlStatement;
import java.util.Scanner;

public class Switch_Statement_DigitC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;  
        System.out.print("Enter Digit: ");
        num = input.nextInt();
        switch(num){
            case 1:
            System.out.println("one  ");
            break;

            case 2:
            System.out.println("two");
            break;

            case 3:
            System.out.println("thiree");
            break;

            case 4:
            System.out.println("four");
            break;

            case 5:
            System.out.println("Five");
            break;

            default:
            System.out.println("No match Out of 1 to 5 ");


        }

        
    }
}
