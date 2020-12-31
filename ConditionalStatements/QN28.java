
/*
Write a program to check whether the year input by user in leap year or not using ternary operator.
*/
import java.util.Scanner;
public class QN28 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=sc.nextInt();
        System.out.println(year%4==0?
        year%100==0?
        year%400==0?
        year+ " is leap year.": year+ " is not leap year." : year+ " is leap year." : year+ " is not leap year.");
        sc.close();
    }
}
