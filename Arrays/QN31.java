/*
Write a Java Method to sort an array of positive integers of a given array, in the sorted array the value of the first element should be maximum, second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.
*/

import java.util.Arrays;

public class QN31 {
     static void sortArray(int[] arr) {
          int[] clone = arr.clone();
          // sorting the clone
          Arrays.sort(clone);
          /*
           * adding the required pattern: 1st element should be maximum, 2nd value should
           * be minimum value, 3rd should be second maximum, 4th second be second minimum
           */
          int maxIndex = clone.length;
          int minIndex = 0;
          for (int i = 0; i < arr.length; i++) {
               if (i % 2 == 0) {
                    arr[i] = clone[--maxIndex];
               } else {
                    arr[i] = clone[minIndex++];
               }
          }
     }

     public static void main(String[] args) {
          int[] arr = { 5, 2, 3, 4, 1, 6 };
          System.out.println("Initial array: " + Arrays.toString(arr));
          sortArray(arr);
          System.out.println("Sorted array: " + Arrays.toString(arr));
     }
}