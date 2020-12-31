// Write a program that checks if the number input by the user is divisible by 5 or not and displays the message accordingly.

import java.util.Scanner;
public class QN3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check either it is divisible by 5 or not: ");
        int num = sc.nextInt();
        // check
        if (num % 5 == 0){
            System.out.println(num+ " is divisible by 5.");
        }
        else{
            System.out.println(num+ " is not divisible by 5.");

        }
    }
}