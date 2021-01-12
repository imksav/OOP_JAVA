
/*
Write a recursive program that counts the number of “E” in a given string.
*/
import java.util.Scanner;

public class QN2 {

     public static int countE(String str1, char ch) {
          int count = 0;
          if (str1.length() == 0) {
               return 0;
          } else {
               if (str1.charAt(count) == ch) {
                    count++;
               }
          }
          return count + countE(str1.substring(1), ch);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a string(lowercase): ");
          String str1 = sc.nextLine();
          char ch = 'e';
          System.out.println("'" + str1 + "' has " + countE(str1, ch) + " 'e'.");
          sc.close();
     }
}
