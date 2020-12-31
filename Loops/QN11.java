
/*
Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
   1
  2 2
 3 3 3
4 4 4 4
*/
import java.util.Scanner;

public class QN11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numOfRows = sc.nextInt();
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= numOfRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
