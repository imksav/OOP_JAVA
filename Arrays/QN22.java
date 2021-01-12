
/*
Write a Java Method to compute the average value of an array of integers except the largest and smallest values.
*/
import java.util.Arrays;

public class QN22 {
     static double getAverage(int[] array) {
          int average = 0;
          for (int i = 0; i < array.length - 1; i++) {
               if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
               }
          }
          for (int i = array.length - 1; i > 0; i--) {
               if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
               }
          }
          int len = 0;
          for (int i = 1; i < array.length - 1; i++) {
               if (array[i] != array[0] && array[i] != array[array.length - 1]) {
                    average += array[i];
                    len++;
               }
               ;
          }
          return ((double) average / len);
     }

     public static void main(String[] args) {
          int[] array = { 2, 5, 7, 8, 1, 3, 9, 4 };
          System.out.println("Initial Array: " + Arrays.toString(array));
          System.out.println("The average execept the smallest and largest numbers: " + getAverage(array));
     }
}
