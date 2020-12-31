
/*
Write a Java method to find the smallest number among three numbers. 
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is 25.0

*/
import java.util.Scanner;

public class QN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The smallest value is " + findSmallest(num1, num2, num3));
        sc.close();
    }

    public static double findSmallest(int num1, int num2, int num3) {
        int temp;
        if (num1 < num2 && num1 < num3) {
            temp = num1;
        } else if (num2 < num1 && num3 < num1) {
            temp = num2;
        } else {
            temp = num3;
        }
        return temp;
    }

}
