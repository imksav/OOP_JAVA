// Write a program that checks if the number input by the user is odd or even and displays the message accordingly.

import java.util.Scanner;
public class QN2{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to check either it is odd or even: ");
        int num = sc.nextInt();
        // check
        if (num % 2 == 0){
            System.out.println(num +" is even.");
        }
        else{
            System.out.println(num +" is odd.");

        }
    }
}