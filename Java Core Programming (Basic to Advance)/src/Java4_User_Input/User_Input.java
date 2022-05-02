package Java4_User_Input;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        //Init java input Scanner Class 
        Scanner input = new Scanner(System.in);

        //variable declear
        String name;
        int number;
        float f;

        // string  mathod 
        System.out.print("enter name :");
        name = input.nextLine().toString();
        System.out.println("my name is :"+name);

        // int mathod 
        System.out.print("Enter Number : ");
        number = input.nextInt();
        System.out.println("the number is : "+number);


        // float type mathod 
        System.out.print("Enter float number: ");
        f = input.nextFloat();
        System.out.println("the point number is : "+f);


        
        
    }
    
}
