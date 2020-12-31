
/*
Write a program in Java to print the Floyd's Triangle. 
Test Data
Input number of rows : 5
Expected Output :
1                                                                                
01                                                                               
101                                                                              
0101                                                                             
10101
*/
import java.util.Scanner;

public class QN12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows:");
        int numOfRows = sc.nextInt();
        int x, y;
        for (int i = 1; i <= numOfRows; i++) {
            if (i % 2 == 0) {
                x = 1;
                y = 0;
            } else {
                x = 0;
                y = 1;
            }
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(x);
                } else {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
