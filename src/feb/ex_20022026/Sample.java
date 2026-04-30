package feb.ex_20022026;

public class Sample {

    int a; // variable, I have delared variable a
    int b =10;//variable, assigned value as 10 to var b

    void test(){
        //This is test method
        //logic comes here or actual code comes here
        a=90;
        b =100;
        int c = 200;
        System.out.println(a + " " +b);


    }

    Sample(){
        //constructor
        System.out.println("In constructor");
    }

    Sample(int ab, int yb, int c){
        //parameterized constructor bcz i have passed three parameters
        System.out.println(ab + b+" " + c);
    }
    Sample(int a, int b){
        System.out.println(a +" "+ b);
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        Sample s1 = new Sample(12,18);
        Sample s2 = new Sample(90,13,56);
        s.test();
        

    }

}
