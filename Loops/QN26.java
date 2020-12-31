
/*
Write a program in java that takes a 4-digit PIN from the user.The user should have a total of 3 attempts of putting in the PIN. If incorrect,the user should be warned with the remaining attempts.
P.S. Actual PIN is 5730
Output:
Please input the PIN: <take input>
Sorry, your PIN is incorrect. You have 2 attempts left.
*/
import java.util.Scanner;

public class QN26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        int pin = sc.nextInt();
        if (pin == 5730) {
            System.out.println("Sucessfully unlocked!");
        } else {
            for (int i = 1; i <= 3; i++) {
                if (i == 3) {
                    System.out.println("Sorry, your PIN is incorrect. You have not left attemps.");
                } else {
                    System.out.println("Sorry, your PIN is incorrect. You have " + (3 - i) + " attemps left.");
                    System.out.println("Enter your PIN: ");
                    pin = sc.nextInt();

                }
                if (pin == 5730) {
                    System.out.println("Sucessfully unlocked!");
                    i = 3 + 1;
                }
            }
        }
        sc.close();
    }
}
