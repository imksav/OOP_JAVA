/*
Write a program to find the sum of 3-digit number input by user.
Example: if the sum of 234 is 2+3+4=9.
*/
import java.util.Scanner;
public class QN14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digits number: ");
        int num1 = sc.nextInt();
        int num1_duplicate = num1;
        int count =0;
        int rem;
        while(num1_duplicate!=0){
            rem = num1_duplicate%10;
            num1_duplicate= num1_duplicate/10;
            count = count+rem;
        }
        System.out.println("The sum of each digit of 3 digits number, "+num1+" is: "+count);
        sc.close();
    }
}
