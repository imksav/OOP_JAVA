
/*
Write a method named operation that takes two integer arguments and a char argument, perform the calculation as per the char argument, and return the result:
Example: operation(2,5,’+’) should return 10 as result.
*/

import java.util.Scanner;

public class QN16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number and an arthimetic operator:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char ch = sc.next().charAt(0);
        System.out.println(operateAsPerArgument(num1, num2, ch));
        sc.close();
    }

    public static int operateAsPerArgument(int num1, int num2, char ch) {
        int total = 0;
        switch (ch) {
            case '+':
                total = num1 + num2;
                break;
            case '-':
                total = num1 - num2;
                break;
            case '*':
                total = num1 * num2;
                break;
            case '/':
                total = num1 / num2;
                break;
            case '%':
                total = num1 % num2;
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }
        return total;
    }
}
