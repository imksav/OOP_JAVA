/*
Write a program that takes three numbers as input from users and print the largest among them using ternary operator.
*/
import java.util.Scanner;
public class QN29 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(num1>num2 && num1>num3?
        num1+ " is largest number.": num2>num1 && num2> num3 ? 
        num2+ " is largest number." : num3+ " is largest number.");
        sc.close();
    }
}
