/*
Write a program that inputs arbitrary positive number from user and prints their sum. Program ends when the input from user is negative.
*/

import java.util.Scanner;

public class QN25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want to enter: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            if (num[i] < 0) {
                i = n;
            }
        }
        for (int i = 0; i < n; i++) {
            if (num[i] >= 0) {
                sum = sum + num[i];
            }
        }
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
