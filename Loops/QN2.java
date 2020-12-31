
/*
Write a program that print from number 1 – 100.
*/
import java.util.Scanner;

public class QN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range (beginning value, ending value):");
        int beginningValue = sc.nextInt();
        int endingValue = sc.nextInt();
        do {
            System.out.println(beginningValue);
            beginningValue++;
        } while (beginningValue <= endingValue);
        sc.close();
    }
}
