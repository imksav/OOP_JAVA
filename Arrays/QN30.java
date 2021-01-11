/*
Write a Java Method to cyclically rotate a given array clockwise by one.
*/

import java.util.Arrays;

public class QN30 {
     static void rotateClockwise(int[] arr) {
          int tempLastVal = arr[arr.length - 1];
          for (int i = arr.length - 1; i > 0; i--) {
               arr[i] = arr[i - 1];
          }
          arr[0] = tempLastVal;
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
          System.out.println("Initial Array: " + Arrays.toString(arr));
          rotateClockwise(arr);
          System.out.println("Rotating Clockwise: " + Arrays.toString(arr));
     }
}
