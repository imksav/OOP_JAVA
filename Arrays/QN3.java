/*
Write a Java Method to test if an array contains a specific value. (Linear Search).
*/

import java.util.Arrays;
import java.util.Scanner;

public class QN3 {
     static boolean found = false;

     static boolean linearSearch(int array[], int searchNum) {
          int len = array.length;
          for (int i = 0; i < len; i++) {
               if (array[i] == searchNum) {
                    found = true;
                    break;
               }
          }
          return found;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int array[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
          System.out.println("Initial array: " + Arrays.toString(array));
          System.out.println("Enter a value you want to search in the array: ");
          int searchNum = sc.nextInt();
          System.out.println("Array has value?\nAnswer: " + linearSearch(array, searchNum));
          sc.close();
     }
}
