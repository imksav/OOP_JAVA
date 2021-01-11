
/*
Write a Java Method to find the common elements between two arrays of integers.
*/
import java.util.ArrayList;
import java.util.Arrays;

public class QN12 {

     public static Object[] getCommonValues(int[] array1, int[] array2) {
          ArrayList<Integer> commonValues = new ArrayList<>();
          for (int i : array1) {
               for (int j : array2) {
                    if (i == j) {
                         commonValues.add(i);
                    }
               }
          }
          return commonValues.toArray();
     }

     public static void main(String[] args) {
          int array1[] = { 1, 2, 3, 5, 7, 9, 11, 34, 56 };
          int array2[] = { 4, 8, 10, 12, 3, 5, 9 };
          System.out.println("Array 1: " + Arrays.toString(array1));
          System.out.println("Array 2: " + Arrays.toString(array2));
          System.out.println(
                    "Comon values in Array 1 and Array 2: " + Arrays.toString(getCommonValues(array1, array2)));

     }
}
