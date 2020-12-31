/*
Write a program to check whether the 3-digit number input by user is palindrome or not.
Example: 232 is palindrome since the number is same from forward and reverse direction.
*/
import java.util.Scanner;
public class QN15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digits numbers: ");
        int num1=sc.nextInt();
        int num1_duplicate= num1;
        int num2=0;
        while(num1_duplicate!=0){
            num2 = (num2*10) +(num1_duplicate%10);
            num1_duplicate = num1_duplicate/10;
        }
        if(num1==num2){
            System.out.println("The entered 3 digits number, "+num1+" is palindrome.");
        }else{
            System.out.println("The entered 3 digits number, "+num1+" is not palindrome.");
        }
        sc.close();
    }
}
