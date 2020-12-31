/*
Write a method that accepts two strings as an argument, str1 and str2, and checks whether if str2 is substring of str1 or not.
*/

import java.util.Scanner;

public class QN20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.next();
        System.out.println("Enter second string:");
        String str2 = sc.next();
        System.out.println(checkSubstring(str1, str2));
        sc.close();
    }

    public static String checkSubstring(String str1, String str2) {
        if (str1.contains(str2) == true) {
            return "Substring";
        } else {
            return "Not substring";
        }
    }
}