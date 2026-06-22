package June_2026;

import java.util.Scanner;

public class PrimeNumberBy_User {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int n = sc.nextInt();
        for(int i=1;i<=100;i++){
            if(i%3==0) {
                System.out.println("Fix");
            }else if(i%5==0){
                
                    System.out.println("Buzz");
                }
                else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else {


                System.out.println(i);
            }    
            }
        }
}

