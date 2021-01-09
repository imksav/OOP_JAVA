/*
Write a program that uses the function power() to raise a number m to power n. The
function takes integer values for m and n and returns the result correctly. Use a default
value of 2 for n to make the function calculate squares when this argument is omitted.
Write a function main() to pass the value of m and n and display the calculated result.

*/

import java.util.Scanner;

public class Power {

     // method
     int power(int m, int n) {
          int power = (int) Math.pow(m, n);
          return power;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number(m): ");
          int m = sc.nextInt();
          System.out.print("Enter the power value(n): ");
          int n = sc.nextInt();
          Power p1 = new Power();
          System.out.println("When power of " + m + " is " + n + ", then result is: " + p1.power(m, n));
          System.out.println("When power of " + m + " is " + 2 + ", then result is: " + p1.power(m, 2));
          sc.close();
     }
}
