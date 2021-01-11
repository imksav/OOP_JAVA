
/*
Write a Java Method to find the second largest element in an array.
*/
import java.util.Arrays;

public class QN13 {
     static int getSecondLargestElement(int[] arr) {
          for (int i = 0; i < 2; i++) {
               for (int j = i; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                    }
               }
          }
          return arr[1];
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 5, 8, 7, 6 };
          System.out.println("Initial array: " + Arrays.toString(arr));
          System.out.println("The second largest element is: " + getSecondLargestElement(arr));
     }
}