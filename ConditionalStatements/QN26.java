/*
Write a program that checks if the number input by user is divisible by 5 or not and display message accordingly using ternary operator.
*/
import java.util.Scanner;
public class QN26 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num1=sc.nextInt();
    System.out.println(num1%5==0? num1+  " is divisible by 5."  : num1+ " is not divisible by 5.");
    sc.close();
    }
}
