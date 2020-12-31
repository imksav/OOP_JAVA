/*
Write a program that checks if the number input by user is odd or even and display message accordingly using ternary operator.
*/
import java.util.Scanner;
public class QN25{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
        System.out.println(num1%2==0? num1+ " is even number." : num1+ " is odd number.");
        sc.close();
    }
}