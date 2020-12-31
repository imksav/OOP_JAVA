/*
 * 1. Write a program that takes two integers as argument and returns their sum.
 */

import java.util.Scanner;

class QN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The sum of two numbers is: " + displaySum(num1, num2));
        sc.close();
    }

    public static int displaySum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}