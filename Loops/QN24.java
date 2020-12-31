/*
Write a program that prints nth Fibonacci number, where n is input from user.
Example:
input: 7
Output: 13
*/

import java.util.Scanner;

public class QN24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n^th term : ");
        int num = sc.nextInt();
        int i = 3, first = 1, second = 1, nextTerm = 0;
        while (i <= num) {
            nextTerm = first + second;
            first = second;
            second = nextTerm;
            i++;
        }
        System.out.println("Series: " + nextTerm);
        sc.close();
    }
}
