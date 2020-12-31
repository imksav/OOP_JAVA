
/*
Write a Java method to count all vowels in a string. 
Test Data:
Input the string: w3resource
Expected Output:
Number of Vowels in the string: 4
*/
import java.util.Scanner;

public class QN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = sc.next().toLowerCase();
        System.out.println("Number of Vowels in the string: " + countVowels(str));
        sc.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
