package June_2026;

public class Browser {
    public static void main(String[] args) {
        String browser = "XYZ";
        switch(browser)
        {
            case "Firefox":
                System.out.println("Run in Firefox");
                break;
            case "Edge":
                System.out.println("Run in Edge");
                break; 
            case "Chrome":
            System.out.println("Chrome");
            break;
            case "Opera":
                System.out.println("Run in Opera");
                break;
            default:
                System.out.println("Invalid Browser");
        }
    }
}
