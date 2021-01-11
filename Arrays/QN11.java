
/*
Write a Java Method to find the duplicate values of an array of integer values.
*/
import java.util.ArrayList;
import java.util.Arrays;

public class QN11 {
     public static Object[] checkDuplicate(int array[]) {
          int[] arrayClone = array.clone();
          ArrayList<Integer> duplicateArray = new ArrayList<>();
          for (int i = 0; i < array.length; i++) {
               for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                         duplicateArray.add(array[i]);
                         break;
                    }
               }
          }
          ArrayList<Integer> listOutAray = new ArrayList<>();
          for (int i : duplicateArray) {
               if (!listOutAray.contains(i)) {
                    listOutAray.add(i);
               }
          }
          return listOutAray.toArray();
     }

     public static void main(String[] args) {
          int[] array = { 1, 3, 5, 7, 6, 9, 7, 8, 3, 4, 5, 7, 9 };
          System.out.println("Initial Arrays: " + Arrays.toString(array));
          System.out.println("Duplicate Values in Initial Arrays: " + Arrays.toString(checkDuplicate(array)));
     }
}
