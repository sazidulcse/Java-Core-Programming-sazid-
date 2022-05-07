package Java06_if_elseControlStatement;
import java.util.Scanner;

public class Switch_ch_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch ; 
        System.out.print("Enter any ch :");
        ch = input.next().charAt(0);

    switch(ch){
        case 'a':
        System.out.println("apple");
        break;
        case 'b':
        System.out.println("Ball");
        break;
        case 'c':
        System.out.println("cat");
        break;
        case 'd':
        System.out.println("dog");
        break;
        case 'e':
        System.out.println("elephent");
        break;
        case 'f':
        System.out.println("frog");
        break;

        default:
        System.out.println("Error type a to f ");

    }

        
    }
}
