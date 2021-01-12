
/*
Write a Java Method to find the number of even and odd integers in a given array of integers. 
*/
import java.util.Arrays;

public class QN21 {
     public static void main(String[] args) {
          int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
          System.out.println("Original Array: " + Arrays.toString(array));
          int counter = 0;
          for (int i = 0; i < array.length; i++) {
               if (array[i] % 2 == 0)
                    counter++;
          }
          System.out.println("Number of even numbers : " + counter);
          System.out.println("Number of odd numbers  : " + (array.length - counter));
     }
}