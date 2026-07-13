package July_2026;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
       System.out.println("Take input");
        Scanner sc= new Scanner(System.in);
        float a= sc.nextFloat();
        System.out.println("Number 1 is " + a);
        //float a= sc.nextFloat();
        Scanner sc1= new Scanner(System.in);
        float b= sc1.nextFloat();
        System.out.println("Number 2 is "+ b);
        float  sum = a+b;
        System.out.println("Sum is "+ sum);
    }
}
