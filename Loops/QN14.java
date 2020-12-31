
/*
Write a Java program that reads a positive integer and count the number of digits the number (less than ten billion) has. 10,000,000,000
Test Data 
Input an integer number less than ten billion: 125463
Expected Output : 6
*/
import java.util.Scanner;

public class QN14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double billion = 1000000000l;
        System.out.println("Enter a number less than ten billion: ");
        int num = sc.nextInt();
        int count = 0;
        if (num >= billion) {
            System.out.println("The number is greater or equals to 10,000,000,000.");
        } else if (num < 0) {
            System.out.println("Invalid input.");
        } else {
            while (num != 0) {
                int rem = (int) num % 10;
                num = (int) num / 10;
                count++;
            }
        }
        System.out.println("Total digts are: " + count);
        sc.close();
    }
}
