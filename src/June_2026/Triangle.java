package June_2026;
import java.util.Scanner;
//import  java.util.lang;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st side of triangle: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter 2nd side of triangle: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter 3rd side of triangle: ");
        double side3 = sc.nextDouble();

        if (side1 >= 1 && side2 >= 1 && side3 >= 1) {
            if (side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("Equal trangle");
            } else if (side1 == side2 || side3 == side2 || side1 == side3) {
                System.out.println("Isoceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Invalid Input");
        }

    }
    }