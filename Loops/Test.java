import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=========================\nWElCOME TO INVISION ATM.\nPlease enter your Pin");

        int attempts = 3;

        for (int i = 1; i <= 3; i++) {
            int pin = sc.nextInt();
            if (pin == 5730) {
                System.out.println("=======Access Granted =======");

            } else {
                attempts--;
                System.out.println("=='WARNING'==\n'your pin is incorrect.you have " + attempts + " attempts left'.");
            }
        }

    }

}