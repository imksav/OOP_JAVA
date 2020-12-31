
/*
Write a program that converts the number entered in English to nepali.
input: 122.332
output: १२२.३३२
*/
import java.util.Scanner;

public class QN21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in English:");
        String num1 = sc.next();
        String ans = "";
        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == '.') {
                ans += ".";
            } else {
                ans += (char) (num1.charAt(i) + 2358);
            }
        }
        System.out.println("Numbers in Nepali:  " + ans);
        sc.close();
    }
}
