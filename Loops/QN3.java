
/*
Write a program in Java to display n terms of natural numbers and their sum.
*/
import java.util.Scanner;

public class QN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n^th terms of natural numbers: ");
        int n = sc.nextInt();
        int n_duplicate = n;
        int sum = 0;
        System.out.print("Natural numbers: \n");
        while (n > 0) {
            System.out.println(n);
            sum = sum + n;
            n--;
        }
        System.out.println("Sum of " + n_duplicate + "th terms of natural numbers is: " + sum);
        sc.close();
    }
}
