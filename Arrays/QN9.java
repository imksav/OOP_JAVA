
/*
Write a Java Method to find the maximum and minimum value of an array. 
*/
import java.util.Arrays;

public class QN9 {

     public static void maximum(int array[]) {
          int[] arr = array.clone();
          int max = arr[0];
          int min = arr[0];
          for (int i : arr) {
               if (i > max) {
                    max = i;
               } else if (min > i) {
                    min = i;
               }
          }
          System.out.println("Maximum in array: " + max);
          System.out.println("Minimum in  array: " + min);
     }

     public static void main(String[] args) {
          int[] array = { 1, 5, 7, 2, 9, 4, 7 };
          System.out.println("Array: " + Arrays.toString(array));
          maximum(array);
     }
}
