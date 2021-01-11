/*
Write a Java Method to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the Method should return 4 as the new length of the array.  

*/

import java.util.ArrayList;
import java.util.Arrays;

public class QN25 {
     public static int removeDuplicates(int[] array) {
          ArrayList<Integer> uniqueArray = new ArrayList<>();
          for (int i : array) {
               if (!uniqueArray.contains(i)) {
                    uniqueArray.add(i);
               }
          }
          return uniqueArray.size();
     }

     public static void main(String[] args) {
          int[] array = { 20, 20, 30, 40, 50, 50, 50 };
          System.out.println("Array: " + Arrays.toString(array) + "\nLength after removing duplicates: "
                    + removeDuplicates(array));
     }
}