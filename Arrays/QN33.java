
/*
 * Write a Java Method to sort a given binary array in linear times. From
 * Wikipedia, Linear time: An algorithm is said to take linear time, or O(n)
 * time, if its time complexity is O(n). Informally, this means that the running
 * time increases at most linearly with the size of the input. More precisely,
 * this means that there is a constant c such that the running time is at most
 * cn for every input of size n. For example, a procedure that adds up all
 * elements of a list requires time proportional to the length of the list, if
 * the adding time is constant, or, at least, bounded by a constant. Linear time
 * is the best possible time complexity in situations where the algorithm has to
 * sequentially read its entire input. Therefore, much research has been
 * invested into discovering algorithms exhibiting linear time or, at least,
 * nearly linear time. This research includes both software and hardware
 * methods. There are several hardware technologies which exploit parallelism to
 * provide this. An example is content-addressable memory. This concept of
 * linear time is used in string matching algorithms such as the Boyer–Moore
 * algorithm and Ukkonen's algorithm.
 * Example:
     Input :
     b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
     Output:
     After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

 */
import java.util.Arrays;

public class QN33 {
     static void sortBinary(int[] arr) {
          int[] clone = arr.clone();
          int index = 0;
          int lastIndex = arr.length - 1;
          for (int j : clone) {
               if (j == 0) {
                    arr[index++] = 0;
               } else {
                    arr[lastIndex--] = 1;
               }
          }
     }

     public static void main(String[] args) {
          int[] arr = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
          System.out.println("Initial Array:\t " + Arrays.toString(arr));
          sortBinary(arr);
          System.out.println("Result: " + Arrays.toString(arr));
     }
}
