/*
Write a program in Java to input 5 numbers from keyboard and find their sum and average.
*/

import java.util.Scanner;

public class QN4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size: ");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter " + i + " number: ");
            int num1 = sc.nextInt();
            sum = sum + num1;
            count++;
        }
        float average = (float) sum / count;
        System.out.println("The sum of " + num + " numbers is: " + sum);
        System.out.println("The average of " + num + " numbers is: " + average);
        sc.close();
    }
}
