
/*
Some dogs are standing in a line, numbered 1, 2, 3, ..... The odd dogs (1, 3, ..) have normal two ears. The even dogs (2, 4, ....) have 3 ears. Recursively, return the number of ears in the dogs line 1,2, ..... n without using loops or multiplication.
*/
import java.util.Scanner;

public class QN3 {
     public static int oddEven(int n) {

          if (n == 0)
               return 0;
          else {
               int ear_num;
               if (n % 2 == 0) {
                    ear_num = 3;
                    return ear_num + oddEven(n - 1);
               } else
                    ear_num = 2;
               return ear_num + oddEven(n - 1);
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println(" Enter the natural number to n terms: ");
          int num = sc.nextInt();
          System.out.println("The number of ears of " + num + " dog =" + oddEven(num));
          sc.close();

     }
}
