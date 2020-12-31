
/*
Write a program in Java to display the multiplication table of a given integer up to 10.
Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :
5 X 0 = 0                                                                        
5 X 1 = 5                                                                        
5 X 2 = 10                                                                       
5 X 3 = 15                                                                       
5 X 4 = 20                                                                       
5 X 5 = 25 …
*/
import java.util.Scanner;

public class QN6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 0; i <= 5; i++) {
            int result = num * i;
            System.out.println(num + " X " + i + " = " + result);
        }
        sc.close();
    }
}
