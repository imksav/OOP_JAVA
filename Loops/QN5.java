/*
Write a program in Java to display the cube of the number up to given an integer.
Test Data
Input number of terms : 4
Expected Output :
Number is : 1 and cube of 1 is : 1                                               
Number is : 2 and cube of 2 is : 8                                               
Number is : 3 and cube of 3 is : 27                                              
Number is : 4 and cube of 4 is : 64
*/

import java.util.Scanner;

public class QN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int cube = i * i * i;
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
        }
        sc.close();
    }
}
