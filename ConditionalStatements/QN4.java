// Write a program that checks if the number input by the user is both even and divisible by 5 or not and displays the message accordingly.

import java.util.Scanner;
public class QN4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        // check
        if(num % 2 ==0 && num%5==0){
            System.out.println(num+" is even and divisible by 5.");
        }
        else if(num%2==0 && num%5!=0){
            System.out.println(num+" is even but not divisible by 5.");
        }
        else if(num%2!=0 && num%5==0){
            System.out.println(num+" is not even but divisible by 5.");
        }
        else{
            System.out.println(num+" is not even and not divisible by 5.");
        }
    }
}