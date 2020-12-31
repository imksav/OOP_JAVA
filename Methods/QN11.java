/*
Write a Java method to check whether a string is a valid password. 
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Expected Output:
1. A password must have at least ten characters.                                             
2. A password consists of only letters and digits.                                         
3. A password must contain at least two digits.                                        
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
Password is valid: abcd1234
*/

import java.util.Scanner;

public class QN11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        displayTermsAndConditions();
        String password = sc.next();
        verifyPassword(password);
        if (verifyPassword(password) == true) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid: " + password);
        }
        sc.close();
    }

    static void displayTermsAndConditions() {
        System.out.println(
                "1. A password must have at least ten characters.\n2. A password consists of only letters and digits.\n3. A password must contain at least two digits.");
        System.out.println("Enter a password (You are agreeing to the above terms and Conditions.):");
    }

    public static boolean verifyPassword(String password) {
        if (password.length() >= 10)
            return false;
        else {

            int charCount = 0, numCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (isNumeric(ch))
                    numCount++;
                else if (isLetter(ch))
                    charCount++;
                else
                    return false;
            }

            return (charCount >= 2 && numCount >= 2);
        }
    }

    static boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
}
