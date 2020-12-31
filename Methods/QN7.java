/*
Write a Java method to compute the sum of the digits in an integer. 
Test Data:
Input an integer: 25
Expected Output:
The sum is 7

*/

import java.util.Scanner;

public class QN7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int num1 = sc.nextInt();
        System.out.println("The sum is " + sumOfDigits(num1));
        sc.close();
    }

    public static int sumOfDigits(int num1) {
        int sum = 0;
        for (int i = 0; i <= num1; i++) {
            int rem = num1 % 10;
            num1 = num1 / 10;
            sum += rem;
        }
        return sum;
    }
}
