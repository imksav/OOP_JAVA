
/*
Write a Java Method to check if an array of integers without 0 and -1.
*/
import java.util.Arrays;

public class QN23 {
     static boolean zeroMinusOne(int[] arr) {
          for (int i : arr) {
               if (i == 0 || i == -1)
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {
          int[] arr = { 2, 9, 1, 8, 4, 5 };
          System.out.println("Initial Array: " + Arrays.toString(arr));
          System.out.println("Is the array is without 0 or -1 ? " + zeroMinusOne(arr));
     }
}