
/*
Design a class to overload a method num_calc() as follows:
     i. void num_calc (int num) with one integer argument, computes the square of integer
     argument.
     ii. void num_calc (int a, int b) with two integer arguments. It computes the product of
     integer arguments.
     iii. void num_calc (String s1, String s2) with two string arguments, which concatenates
     and prints the combined strings.

*/
import java.util.Scanner;

public class Overload {

     // methods
     public void num_calc(int num) {
          int square = num * num;
          System.out.println("Square of " + num + " is: " + square);
     }

     public void num_calc(int a, int b) {
          int product = a * b;
          System.out.println("Product of " + a + " and " + b + " is: " + product);
     }

     public void num_calc(String s1, String s2) {
          String concate = s1.concat(s2);
          System.out.println("Concatenation of " + s1 + " and " + s2 + " is: " + concate);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number(num): ");
          int num = sc.nextInt();
          System.out.print("Enter a number(a): ");
          int a = sc.nextInt();
          System.out.print("Enter a number(b): ");
          int b = sc.nextInt();
          sc.nextLine();
          System.out.print("Enter a string(s1): ");
          String s1 = sc.nextLine();
          System.out.print("Enter a string(s2): ");
          String s2 = sc.nextLine();
          Overload o1 = new Overload();
          o1.num_calc(num);
          o1.num_calc(a, b);
          o1.num_calc(s1, s2);
          sc.close();
     }
}
