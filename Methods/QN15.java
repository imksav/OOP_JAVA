
/*
15.Write a method that takes an integer as argument and checks if the number is palindrome or not. The method should return true if the number is palindrome or false if not. Write a main method to check the method you have created.
*/
import java.util.Scanner;

public class QN15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(checkPalindrome(num));
        sc.close();
    }

    public static boolean checkPalindrome(int num) {
        int duplicate_num = num;
        int num2 = 0;
        while (duplicate_num != 0) {
            num2 = (num2 * 10) + (duplicate_num % 10);
            duplicate_num = duplicate_num / 10;
        }
        if (num2 == num)
            return true;
        else
            return false;
    }

}
