/*
Write a method that reverses the string passed as argument.
*/

import java.util.Scanner;

public class QN18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name = sc.next();
        String reversed = reverseString(name);
        System.out.println(reversed);
        sc.close();
    }

    public static String reverseString(String name) {
        if (name.isEmpty()) {
            return name;
        }
        return reverseString(name.substring(1)) + name.charAt(0);
    }
}
