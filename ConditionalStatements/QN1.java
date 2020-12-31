// Write a program that takes two numbers as input from users and print the largest among them.

import java.util.Scanner;
public class QN1{
    public static void main(String[] args){
        System.out.println("Enter the two numbers below: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // Checking largest number
        if (num1>num2){
            System.out.println(num1+" is the largest number.");
        }
        else{
            System.out.println(num2+" is the largest number.");

        }
    }
}