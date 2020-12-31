
/*
Write a program that prints n Fibonacci numbers, where n is input from user
Example:
input: 7
Output: 1 1 2 3 5 8 13 
*/
import java.util.Scanner;

public class QN23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int t1 = 1, t2 = 1, nextTerm;
        System.out.print("Fibonacci series are: " + t1 + " " + t2 + " ");
        for (int i = 2; i <= (num - 1); i++) {
            nextTerm = t1 + t2;
            System.out.print(nextTerm + " ");
            t1 = t2;
            t2 = nextTerm;
        }
        sc.close();
    }
}
