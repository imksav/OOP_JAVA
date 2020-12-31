/*
Write a program to print absolute value of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1 
*/
import java.util.Scanner;
public class QN17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
        int num2;
        if(num1<0 && num1!=0){
            num2 = num1 * (-1);
            System.out.println("Output of entered number, "+num1+" is "+ num2);
        }else{
            System.out.println("Output of entered number, "+num1+" is "+ num1);
        }
        sc.close();
    }
}
