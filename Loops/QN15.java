/*
Write a program to calculate the factorial of number input by user.
Test Data
Input an integer: 5
Expected Output : 120
*/

import java.util.Scanner;

public class QN15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        double factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of "+num+ " is "+factorial);
        sc.close();
    }
}
