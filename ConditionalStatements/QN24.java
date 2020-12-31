/*
Write a program that takes two numbers as input from users and print the largest among them using ternary operator.
*/
import java.util.Scanner;
public class QN24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int num1=sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println((num1>num2)? num1+" is largest number.": num2+ " is largest number.");
        sc.close();
    }
}
