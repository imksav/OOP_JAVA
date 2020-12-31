
/*
Write a Java method to count all words in a string. 
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9

*/
import java.util.Scanner;

public class QN6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string data: ");
        String str = sc.nextLine();
        System.out.println(countWords(str));
        sc.close();
    }

    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        return (count + 1);
    }
}