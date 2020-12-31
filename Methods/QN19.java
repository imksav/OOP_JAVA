/*
Write a method that replaces all the vowels of a string passed as argument with the next character.
*/

import java.util.Scanner;

public class QN19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string data:");
        String str = sc.next();
        System.out.println(replaceVowelWithPreceedingLetter(str));
        sc.close();
    }

    public static String replaceVowelWithPreceedingLetter(String str) {
        String character = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                character += (char) (str.charAt(i) + 1);
            } else {
                character += (char) (str.charAt(i));
            }
        }
        return "Expected result: " + character;
    }
}
