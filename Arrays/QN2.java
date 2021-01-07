
/*
Write a Java Method to sum values of an array input from user. Also calculate the average value of the elements.
*/
import java.util.Scanner;

public class QN2 {
     public static void sumAverage(int n, int Integer[]) {
          int sum = 0;
          double average;
          for (int i = 0; i < n; i++) {
               sum = Integer[i] + sum;
          }
          System.out.println("Sum: " + sum);
          average = sum / n;
          System.out.println("Average: " + average);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of integer value you want to print: ");
          int n = sc.nextInt();
          int Integer[] = new int[n];
          for (int i = 0; i < n; i++) {
               System.out.print("Integer[" + (i + 1) + "]: ");
               Integer[i] = sc.nextInt();
          }
          sumAverage(n, Integer);
          sc.close();
     }
}
