/*
Write a program to find whether a given character is a digit or a letter. Test your program.
*/
import java.util.Scanner;
public class QN12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
            System.out.println(ch + " is alphabet.");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println(ch + " is digit.");
        } else {
            System.out.println(ch + " is special character.");
        }
        sc.close();
    }
}
