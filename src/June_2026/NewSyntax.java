package June_2026;

public class NewSyntax {
    public static void main(String[] args) {
        int a=24;
        switch(a)
        {
            case 24 -> System.out.println("24");
            case 2 -> System.out.println("435");
            case 3 -> System.out.println("543");
            //;case 3 -> System.out.println("543");
            default -> System.out.println("default");
        }
    }
}
