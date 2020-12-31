/*
Write a program that takes two input from user: a floating point digit and a precision, and round off and display the number to that precision.
Example: 
input 13.3574    2
output: 13.36
*/

import java.util.Scanner;

public class QN19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating point digit: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the value for precision: ");
        int precision = sc.nextInt();
        int j = 1;
        for (int i = 0; i < precision; i++) {
            j = j * 10;
        }
        float value = (int) (num1 * j + 0.5);
        value = value / j;
        System.out.println("value: " + value);
        sc.close();
    }
}
