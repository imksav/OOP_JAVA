
/*
Write a Java Method to check if an array of integers contains two specified elements 65 and 77.
*/
import java.util.Arrays;

public class QN24 {
     static boolean has65_77(int[] arr) {
          boolean hasBoth65_77 = false;
          for (int i : arr) {
               hasBoth65_77 = i == 65;
          }
          for (int i : arr) {
               hasBoth65_77 = i == 77;
          }
          return hasBoth65_77;
     }

     public static void main(String[] args) {
          int[] arr = { 40, 89, 65, 77 };
          System.out.println("Intitial Array: " + Arrays.toString(arr));
          System.out.println("Does the array have both 65 and 77 ? " + has65_77(arr));
     }
}