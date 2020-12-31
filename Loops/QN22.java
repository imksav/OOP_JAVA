
/*
22.Write a generalize program for Q20 and Q21 by asking the format of money from user (e for English and n for Nepali) and displaying formatted output accordingly.
input: 1242342
format: n
output: !@,$@,#$@
*/
import java.util.Scanner;

public class QN22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'e' for English Money Format :");
        System.out.println("Enter 'n' for Nepali Money Format : ");
        String respond1 = sc.next();
        if ("e".equals(respond1.toLowerCase())) {
            int count = 0;
            String num2 = " ";
            System.out.println("Enter any number ");
            String num = sc.next();
            StringBuilder num1 = new StringBuilder(num);
            num1.reverse();
            for (int i = 0; i < num1.length(); i++) {
                char ch = num1.charAt(i);
                num2 = num2 + ch;
                count++;
                if (count != 1 & count % 3 == 0) {
                    if (count % 3 == 0 & count == num1.length()) {
                        break;
                    }
                    num2 = num2 + ",";
                }
            }
            StringBuilder num3 = new StringBuilder(num2);
            System.out.println(num3.reverse());
        } else if ("n".equals(respond1.toLowerCase())) {
            int count = 0;
            String num2 = " ";
            System.out.println("Enter any number ");
            String num = sc.next();
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
        } else {
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}
