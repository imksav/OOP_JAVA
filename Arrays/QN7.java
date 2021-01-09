
/*
Write a Java Method to insert an element (specific position) into an array.
*/
import java.util.Arrays;
import java.util.Scanner;

public class QN7 {

     public static void addToArray(int array[], int index, int value) {
          for (int i = array.length - 1; i > index; i--) {
               array[i] = array[i - 1];
          }
          array[index] = value;
          System.out.println("The new array is: " + Arrays.toString(array));
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int array[] = { 2, 4, 6, 8, 10 };
          System.out.println("Initial array: " + Arrays.toString(array));
          System.out.print("Enter the index value in which you want to insert a new value: ");
          int index = sc.nextInt();
          System.out.print("Enter the value you want to add: ");
          int value = sc.nextInt();
          addToArray(array, index, value);
          sc.close();
     }
}
