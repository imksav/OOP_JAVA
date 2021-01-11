/*
 * 1. Write a Java Method that sorts an String array input by user in descending
 * alphabetic order.
 */

import java.util.Arrays;
import java.util.Scanner;

public class QN18 {
     static void getDescendingOrder(String[] arr) {
          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                         String temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                    }
               }
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the array elements:");
          String[] arr = sc.nextLine().split(" ");
          System.out.println("Initial array: " + Arrays.toString(arr));
          getDescendingOrder(arr);
          System.out.println("Final array: " + Arrays.toString(arr));
          sc.close();
     }
}
