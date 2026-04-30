package feb.ex_21022026;



    public class reversenumber {
        public static void main(String[] args) {

            int number = 1234;   // original number
            int reverse = 0;     // this will store reversed number

            while (number != 0) {

                int digit = number % 10;     // get last digit
                reverse = reverse * 10 + digit;  // build reverse number
                number = number / 10;        // remove last digit
            }

            System.out.println("Reversed number is: " + reverse);
        }
    }

