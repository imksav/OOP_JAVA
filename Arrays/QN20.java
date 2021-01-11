
/*
Write a Java Method to test the equality of two arrays.
*/
import java.util.Arrays;

public class QN20 {
     static boolean testEquality(int[] arr1, int[] arr2) {
          boolean isEqual = true;
          if (arr1.length != arr2.length)
               return false;
          for (int i : arr1) {
               for (int j : arr2) {
                    if (i != j) {
                         isEqual = false;
                         break;
                    }
               }
          }
          return isEqual;
     }

     public static void main(String[] args) {
          int[] arr1 = { 1, 2, 5, 7, 9 };
          int[] arr2 = { 9, 7, 5, 2, 1 };
          System.out.println("First Array: " + Arrays.toString(arr1) + "\nSecond Array: " + Arrays.toString(arr2));
          System.out.println("Is Equality?: " + testEquality(arr1, arr2));
     }
}
