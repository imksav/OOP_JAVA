/*
Write a Java Method to input n integer values from user, store it into an array and print all the elements.
*/

import java.util.Scanner;

public class QN1 {

     static void print(int n, int Integer[]) {
          System.out.println("===============Printing the " + n + " integer value you have entered===============");
          for (int i = 0; i < n; i++) {
               System.out.print(Integer[i] + "\t");
          }
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
          sc.close();

          print(n, Integer);

     }
}