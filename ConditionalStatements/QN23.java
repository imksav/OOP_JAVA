/*
Write a Java program that reads in two integer numbers and tests whether they are the same up to three position starting from the least position.
Test Data
Input integer number: 123424256
Input integer another number: 3256 
Expected Output :
They are same.
*/
import java.util.Scanner;
public class QN23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        double duplicate_num1 = num1%1000;
        double duplicate_num2 = num2%1000;
        if(duplicate_num1==duplicate_num2){
            System.out.println("They are same.");
        }
        else{
            System.out.println("They are different.");
        }
        sc.close();
    }
}
