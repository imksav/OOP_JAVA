
/*
Write a program that displays the amount entered by user in nepali money format.
Example: 
input: 1242342
output: 1,24,342
*/
import java.util.Scanner;

public class QN20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num2 = " ";
        System.out.println("Enter any number ");
        String num = sc.next();
        int count = 0;
        StringBuilder num1 = new StringBuilder(num);
        num1.reverse();
        for (int i = 0; i < num1.length(); i++) {
            char ch = num1.charAt(i);
            num2 = num2 + ch;
            count++;
            if (count != 1 & (count % 2) != 0) {
                if (count % 2 != 0 & count == num1.length()) {
                    break;
                }
                num2 = num2 + ",";
            }
        }
        StringBuilder num3 = new StringBuilder(num2);
        System.out.println(num3.reverse());
        sc.close();
    }
}
