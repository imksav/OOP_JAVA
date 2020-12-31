
/*
Write a program to count the number of upper case, lower case, digit and other character from a string that is taken as input from user.
*/
import java.util.Scanner;

public class QN18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string data: ");
        String s1 = sc.nextLine();
        int uppercase = 0, lowercase = 0, number = 0, special = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowercase++;
            } else if (ch >= 0 && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }
        System.out.println("Total number of uppercase : " + uppercase);
        System.out.println("Total number of lowercase : " + lowercase);
        System.out.println("Total number of number : " + number);
        System.out.println("Total number of special : " + special);
        sc.close();
    }
}
