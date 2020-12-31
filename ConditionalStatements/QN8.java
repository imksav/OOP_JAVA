/*
Write a program to check whether the year input by user in leap year or not.
*/
import java.util.Scanner;
public class QN8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is leap year.");
                } else {
                    System.out.println(year + " is not leap year.");
                }
            } else {
                System.out.println(year + " is leap year.");
            }
        } else {
            System.out.println(year + " is not leap year.");
        }
        sc.close();
    }
}
