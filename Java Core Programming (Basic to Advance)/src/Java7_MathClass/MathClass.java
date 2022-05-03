package Java7_MathClass;

public class MathClass {
    public static void main(String[] args) {
        //init variable
        int num1=2, num2=3;

        //use math operation 
        //max num
        int max = Math.max(num1, num2);
        System.out.println("the max num is : "+max);
        
        //min num
        int min = Math.min(num1, num2);
        System.out.println("the min num is : "+min);

        //power
        double power = Math.pow(num1, num2);
        System.out.println("the pow is : "+power);

        //round 
        float round = Math.round(6.6f);
        System.out.println("the round of : "+round);

        //pi valu
        double pi = Math.PI;
        System.out.println("PI valu is : "+pi);

        
    }
    
}
