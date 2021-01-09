/*
Write a Java Method to copy an array by iterating the array.
*/

import java.util.Arrays;

public class QN6 {

     public static void copyArray(String array[]) {
          String copyArray[] = new String[array.length];
          for (int i = 0; i < array.length; i++) {
               copyArray[i] = array[i];
          }
          System.out.println("Copy of initial array:\n" + Arrays.toString(copyArray));
     }

     public static void main(String[] args) {
          String array[] = { "Ram", "Shyam", "Hari", "Sita" };
          System.out.println("Initial array:\n" + Arrays.toString(array));
          copyArray(array);
     }
}
