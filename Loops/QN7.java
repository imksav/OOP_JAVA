/*
Write a program in Java to display the n terms of odd natural number and their sum. 
Test Data
Input number of terms is: 5
Expected Output :
The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number up-to 5 terms is: 25
*/

import java.util.Scanner;

public class QN7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num = sc.nextInt();
        int num1 = 1;
        int sum = 0;
        System.out.println("The odd numbers are: ");
        for (int i = 1; i <= num; i++) {
            System.out.println(num1);
            sum = sum + num1;
            num1 = num1 + 2;
        }
        System.out.println("The Sum of odd Natural Number up-to " + num + " terms is: " + sum);
        sc.close();
    }
}
