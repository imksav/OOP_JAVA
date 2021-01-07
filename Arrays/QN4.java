
/*
Write a Java Method to find the index of an array element.
*/
import java.util.Scanner;

public class QN4 {

     static int indexSearch(int array[], int indexNum) {
          if (array == null) {
               return -1;
          }
          int i = 0;
          while (i < array.length) {
               if (array[i] == indexNum) {
                    return i;
               } else {
                    i++;
               }
          }
          return -1;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int array[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
          System.out.println("Enter a value whose index you want to find in the array: ");
          int indexNum = sc.nextInt();
          int index = indexSearch(array, indexNum);
          if (index < 0) {
               System.out.println(indexNum + " is not found in array.");
          } else {
               System.out.println("Index of " + indexNum + ": " + index);
          }
          sc.close();
     }
}
