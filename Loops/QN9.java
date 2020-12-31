
/*
Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row. The pattern is as follows :
1
22
333
4444
*/
import java.util.Scanner;

public class QN9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numOfRows = sc.nextInt();
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
