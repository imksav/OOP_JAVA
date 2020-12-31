
/*
Write a program HighLow.java that implements a simple guessing game High and Low. The program selects a random number between 1 to 100. The player than tries to guess its value. After each, the program gives a hint higher or lower. An execution might look like this:
Guess 1: 52
Hint: higher
Guess 2: 72
Hint: lower
Guess 3: 68
Correct after only 3 guesses – brilliant!!
The program is terminated after 10 guesses with a suitable comment. Use Scanner class to take input from the user.
*/
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * (100 - 1 + 1) + 1);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number from 1-100: ");
            int num = sc.nextInt();
            if (num > randomNumber) {
                System.out.println("Guess " + i + " :" + num);
                System.out.println("Hint: Lower");
            } else if (num < randomNumber) {
                System.out.println("Guess " + i + " :" + num);
                System.out.println("Hint: Higher");
            } else {
                System.out.println("Guess " + i + " :" + num);
                System.out.println("Correct after only " + (i) + " guesses, brilliant!");
                i = 10;
            }
            if (i >= 10) {
                System.out.println("Program terminated.");
            }
        }
        sc.close();
    }
}
