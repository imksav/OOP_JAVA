
/*
35.	Write a Java Method to shuffle a given array of integers.   
Example:
     Input :
          nums = { 1, 2, 3, 4, 5, 6 }
     Output:
          Shuffle Array: [4, 2, 6, 5, 1, 3]
*/
import java.util.Random;
import java.util.Arrays;

public class QN35 {
     static void randomize(int arr[], int n) {
          Random r = new Random();

          for (int i = n - 1; i > 0; i--) {

               int j = r.nextInt(i + 1);

               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
          }
          System.out.println(Arrays.toString(arr));
     }

     public static void main(String[] args) {

          int[] arr = { 1, 2, 3, 4, 5, 6 };
          int n = arr.length;
          randomize(arr, n);
     }
}
