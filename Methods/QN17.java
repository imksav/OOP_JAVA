/*
Write a program that uses the function power() to raise a number m to power n. The function takes integer values for m and n and returns the result correctly. Use a default value of 2 for n to make the function calculate squares when this argument is omitted. Write a function main() to pass the value of m and n and display the calculated result.
*/

import java.util.Scanner;

public class QN17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m:");
        int m = sc.nextInt();
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Calculated result: " + power(m, n));
        System.out.println("Calculated result: " + power(m));
        sc.close();
    }

    static int power(int m, int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= m;
        }
        return sum;
    }

    static int power(int m) {
        return (int) Math.pow(m, 2);
    }
}
