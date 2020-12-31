
/*
Write a Java program that reads in two floating-point numbers and tests whether they are the same up to n decimal places, n input from user.
Test Data
Input floating-point number: 1.256355
Input floating-point another number: 1.25621312
precision: 3
Expected Output :
They are same
*/
import java.util.Scanner;

public class QN29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating number: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float duplicate_num1 = (int) (num1 * 1000);
        float dumplicate_num2 = (int) (num2 * 1000);
        if (duplicate_num1 == dumplicate_num2) {
            System.out.println("They are same.");
        } else {
            System.out.println("They are different.");
        }
        sc.close();
    }
}
