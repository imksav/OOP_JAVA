/*
Write a Java Method to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers.
*/

import java.util.Arrays;

public class QN32 {
     static void seperateEvenOdd(int[] arr) {
          int[] duplicateArray = arr.clone();
          int index = 0;
          int lastIndex = arr.length - 1;
          for (int j : duplicateArray) {
               if (j % 2 == 0)
                    arr[index++] = j;
               else
                    arr[lastIndex--] = j;
          }
     }

     public static void main(String[] args) {
          int[] arr = { 1, 4, 6, 8, 3, 5 };
          System.out.println("Initial Array: " + Arrays.toString(arr));
          seperateEvenOdd(arr);
          System.out.println("Separating odd and even terms: " + Arrays.toString(arr));
     }
}