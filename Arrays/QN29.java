
/*
Write a Java Method to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.
*/
import java.util.Arrays;

public class QN29 {
     public static void segregateBinary(int[] arr) {
          for (int i = 0; i < arr.length; i++) {
               for (int j = i; j < arr.length; j++) {
                    int temp;
                    if (arr[i] > arr[j]) {
                         temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                    }
               }
          }
     }

     public static void main(String[] args) {
          int[] arr = { 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1 };
          System.out.println("Initial Array: " + Arrays.toString(arr));
          segregateBinary(arr);
          System.out.println("Segregatted Array: " + Arrays.toString(arr));
     }
}
