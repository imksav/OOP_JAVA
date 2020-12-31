
/*
Write a program that print Hello world 100 times.
*/
import java.util.Scanner;

public class QN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to print hello world?");
        int numOfTimes = sc.nextInt();
        int i = 0;
        while (i < numOfTimes) {
            System.out.println((i + 1) + ". Hello World!!!!");
            i++;
        }
        sc.close();
    }
}