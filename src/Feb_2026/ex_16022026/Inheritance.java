package Feb_2026.ex_16022026;

public class Inheritance {
     int a;

}
class B extends Inheritance{
    B(){
        a=10;
        System.out.println(a);
    }
}

class C extends B{
    public static void main(String[] args) {
        B b =new B();
    }
}




