/*
Write a Java program that reads in two integer numbers and tests whether they are the same up to n position starting from the least position, n input by user.
Test Data
Input integer number: 123424256
Input integer another number: 3256 
value of n: 3
Expected Output :
They are same.
*/

import java.util.Scanner;

public class QN30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the n^th position: ");
        int n = sc.nextInt();
        int converter = 1;
        for (int i = 0; i < n; i++) {
            converter *= 10;
        }
        int duplicate_num1 = num1 % converter;
        int duplicate_num2 = num2 % converter;
        if (duplicate_num1 == duplicate_num2) {
            System.out.println("They are same.");
        } else {
            System.out.println("They are different.");
        }
        sc.close();
    }
}
