/*
Write a Java method to display the middle character of a string. 
Note:
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Test Data:
Input a string: 350
Expected Output:                                                                          
The middle character in the string: 5

*/

import java.util.Scanner;

public class QN4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String data = sc.next();
        System.out.print("The middle character in the string: " + findMiddleNumber(data));
        sc.close();
    }

    public static String findMiddleNumber(String data) {
        String ans = " ";
        if (data.length() % 2 == 0) {
            for (int i = 1; i >= 0; i--) {
                ans += data.charAt((data.length() / 2) - i);
            }
            return ans;
        } else {
            ans += data.charAt(data.length() / 2);
            return ans;
        }
    }
}
