/*
Write a program to print the reverse of a 3-digit number input by user.
Example: if the number input by user is 325, then the output should be 523.
*/

import java.util.Scanner;
public class QN13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digits number: ");
        int num1=sc.nextInt();
        int num1_duplicate = num1;
        int num2 =0;
        while(num1_duplicate!=0){
            num2 = (num2*10)+(num1_duplicate%10);
            num1_duplicate = num1_duplicate/10;
        }
        System.out.println("The reverse of number that you have entered, "+num1+" is : "+num2);
        sc.close();
    }  
}
