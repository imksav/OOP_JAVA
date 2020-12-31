/*
Write a Java method to compute the average of three numbers. 
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output
The average value is 45.0

*/

import java.util.Scanner;

public class QN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The average value is " + average(num1, num2, num3));
        sc.close();
    }

    public static double average(int num1, int num2, int num3) {
        double average = (num1 + num2 + num3) / 3;
        return average;
    }
}
