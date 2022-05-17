package Java12_Array;

public class Array01_oneDeimontional {
    public static void main(String[] args) {


        // array create way 1
        int [] array1;
        array1 = new int [5];
        // array create way 2

        int [] array2 = new int [6];
        // array init 
        array1 [0] = 10;
        array1 [1] = 20;
        array1 [2] = 30;
        array1 [3] = 40;




        System.out.println(array1[0]);
        

        // array length 
        int len = array1.length;
        System.out.println("length is ="+len);
        // array valu sum 

        int sum = array1[0]+ array1[1]+array1[2]+array1[3];
        System.out.println("array sum is ="+sum);
    }
}
