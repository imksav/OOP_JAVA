/*
Write a Java Method to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
*/

import java.util.Arrays;

public class QN9 {
     public static int difference(int array[]) {
          int[] arr = array.clone();
          int max = arr[0];
          int min = arr[0];
          int difference = 0;
          if (arr.length < 1) {
               return 0;
          } else {
               for (int i : arr) {
                    if (i > max) {
                         max = i;
                    } else if (min > i) {
                         min = i;
                    }
                    difference = max - min;
               }
          }
          return difference;
     }

     public static void main(String[] args) {
          int array[] = { 1, 2, 4, 5, 7, 9, 12, 14, 15 };
          System.out.println("Array: " + Arrays.toString(array));
          System.out.println("The difference between maximum and minimum number in array is: " + difference(array));
     }
}
