
/*
 * 1. There are a number of bunnies and each bunny has two big floppy ears.
 * Compute the total number of ears for all the bunnies recursively, without
 * using loops or multiplication.
 */
import java.util.Scanner;

public class QN1 {
     public static int bunnyEars(int bunnies) {
          if (bunnies == 0) {
               return 0;
          } else {
               return bunnyEars(bunnies - 1) + 2;
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of bunny :");
          int num = sc.nextInt();
          System.out.println("The total number of ears of " + num + " bunnies = " + bunnyEars(num));
          sc.close();
     }
}