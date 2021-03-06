/*
Write a program to check whether a number input by user is Armstrong or not.
153=1^3+5^3+3^3
*/

import java.util.Scanner;

public class QN17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        int num1_duplicate = num1;
        int rem;
        int num2 = 0;
        while (num1_duplicate != 0) {
            rem = num1_duplicate % 10;
            num1_duplicate = num1_duplicate / 10;
            num2 = num2 + rem * rem * rem;
        }
        if (num1 == num2) {
            System.out.println("The entered 3 digits numbeer, " + num1 + " is Armstrong.");
        } else {
            System.out.println("The entered 3 digits numbeer, " + num1 + " is not Armstrong.");
        }
        sc.close();
    }
}
