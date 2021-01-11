/*
28.	Write a Java Method to find smallest and second smallest elements of a given array.   
*/

import java.util.Arrays;

public class QN28 {
     public static int[] getSmallest_SecondSmallest(int[] array) {
          int[] twoSmallest = new int[2];
          for (int i = 0; i < array.length; i++) {
               for (int j = i; j < array.length; j++) {
                    int temp;
                    if (array[i] > array[j]) {
                         temp = array[i];
                         array[i] = array[j];
                         array[j] = temp;
                    }
               }
          }
          twoSmallest[0] = array[0];
          twoSmallest[1] = array[1];
          return twoSmallest;
     }

     public static void main(String[] args) {
          int[] array = { 5, 4, 2, 8, 9, 34, 23, 55, 87 };
          System.out.println("Initial Array: " + Arrays.toString(array));
          System.out.println("The two smallest numbers are: " + Arrays.toString(getSmallest_SecondSmallest(array)));
     }
}
