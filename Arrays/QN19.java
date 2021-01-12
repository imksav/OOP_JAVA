
/*
Write a Java Method to find all pairs of elements in an array whose sum is equal to a specified number. 
*/
import java.util.Arrays;
import java.util.Scanner;

public class QN19 {
     static void pairValues(int inputArray[], int inputNumber) {
          System.out.println("Pairs of elements and their sum: ");

          for (int i = 0; i < inputArray.length; i++) {
               for (int j = i + 1; j < inputArray.length; j++) {
                    if (inputArray[i] + inputArray[j] == inputNumber) {
                         System.out.println(inputArray[i] + " + " + inputArray[j] + " =  " + inputNumber);
                    }
               }
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int array[] = { 3, 6, 8, 9, 1, 4 };
          System.out.println("Array: " + Arrays.toString(array));
          System.out.println("Enter the sum value you want from array: ");
          int num = sc.nextInt();
          pairValues(array, num);
          sc.close();

     }
}