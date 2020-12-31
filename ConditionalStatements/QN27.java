/*
Write a program that checks if the number input by user is both even and divisible by 5 or not and display message accordingly using ternary operator.
*/
import java.util.Scanner;
public class QN27 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1= sc.nextInt();
        System.out.println(num1%2==0 && num1%5==0?
                num1+ " is even and divisible by 5." : num1%2==0 && num1%5!=0? 
                num1+ " is even but not divisible by 5." : num1%2!=0 && num1%5==0? 
                num1+ " is not even but divisible by 5." : num1+ " is not even and not divisbile by 5.");
        sc.close();
    }
}
