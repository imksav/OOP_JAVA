
/*
Write a Java Method to reverse an array of integer values.  
*/
import java.util.Arrays;

public class QN10 {
     public static void getReverse(int array[]) {
          int duplicateArray[] = array.clone();
          for (int i = 0; i < array.length; i++) {
               array[i] = duplicateArray[duplicateArray.length - 1 - i];
          }
     }

     public static void main(String[] args) {
          int array[] = { 1, 3, 7, 9, 34, 54, 23, 38, 98 };
          System.out.println("Initial Array: " + Arrays.toString(array));
          getReverse(array);
          System.out.print("Reversed Array: " + Arrays.toString(array));
     }
}