package June_2026;

public class Max {
    public static void main(String[] args) {
       int max= max();
        System.out.println("Max no is:  "+ max);
    }
    public static int max(){
        int a=10;
        int b=20;
        if(a>b){
           return a;
        }else{
         return b;   
        }
    }
}
