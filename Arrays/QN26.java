
/*
Write a Java Method to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6]
Target value: 6
*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class QN26 {
     public static HashMap<Integer, Integer> getPairsEqualToTarget(int[] array, int target) {
          HashMap<Integer, Integer> pairs = new HashMap<>();
          for (int i = 0; i < array.length; i++) {
               for (int j = i; j < array.length; j++) {
                    int sum = array[i] + array[j];
                    if (sum == target) {
                         pairs.put(array[i], array[j]);
                         return pairs;
                    }
               }
          }
          return pairs;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int[] array = { 1, 2, 4, 5, 6 };
          System.out.println("Enter the targeted value: ");
          int target = sc.nextInt();
          System.out.println("Array:" + Arrays.toString(array));
          System.out.println("Target value: " + target);
          System.out.println(getPairsEqualToTarget(array, target));
          sc.close();
     }
}
