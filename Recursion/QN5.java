
/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14". 
*/
import java.util.Scanner;

public class QN5 {
     public String replace(String str) {
          if (str.length() <= 1) {
               return str;
          }
          if (str.charAt(0) == 'p' && str.length() >= 2 && str.charAt(1) == 'i') {
               return "3.14" + replace(str.substring(2, str.length()));
          }
          return str.charAt(0) + replace(str.substring(1, str.length()));
     }

     public static void main(String[] args) {
          QN5 obj = new QN5();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the string");
          String text = sc.next();
          System.out.println(obj.replace(text));
          sc.close();
     }
}
