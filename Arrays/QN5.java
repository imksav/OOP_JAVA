
/*
Write a Java Method to remove a specific element from an array.  
*/
import java.util.Arrays;
import java.util.Scanner;

public class QN5 {
     public static void removeElement(int array[], int element) {
          for (int i = 0; i < array.length; i++) {
               if (array[i] == element) {
                    for (int j = i; j < array.length - 1; j++) {
                         array[j] = array[j + 1];
                    }
                    break;
               }
          }
          array[array.length - 1] = 0;
          System.out.println("The final array: " + Arrays.toString(array));
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int[] array = { 1, 2, 5, 7, 9, 11, 13, 15, 17, 19 };
          System.out.println("Initial Array: " + Arrays.toString(array));
          System.out.print("Enter the element to remove from the initial array: ");
          int element = sc.nextInt();
          removeElement(array, element);

          sc.close();
     }
}
