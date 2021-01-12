/*
Given two sorted arrays A and B of size p and q, write a Java Method to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
Example:
     Input :
          int[] A = { 1, 5, 6, 7, 8, 10 }
          int[] B = { 2, 4, 9 }
     Output:
     Sorted Arrays:
          A: [1, 2, 4, 5, 6, 7]
          B: [8, 9, 10]

*/

public class QN34 {
     public static void mergeArray(int[] firstArray, int[] secondArray) {
          int[] mergedArray = new int[firstArray.length + secondArray.length];
          // merging array starts...............
          for (int i = 0; i < mergedArray.length; i++) {
               if (i < firstArray.length)
                    mergedArray[i] = firstArray[i];
               else
                    mergedArray[i] = secondArray[i % secondArray.length];
          }
          // sorting merged array here..................
          for (int i = 0; i < mergedArray.length; i++) {
               for (int j = i; j < mergedArray.length; j++) {
                    int temp;
                    if (mergedArray[i] > mergedArray[j]) {
                         temp = mergedArray[i];
                         mergedArray[i] = mergedArray[j];
                         mergedArray[j] = temp;
                    }
               }
          }
          // assigning to the inserted arrays.......................
          for (int i = 0; i < mergedArray.length; i++) {
               if (i < firstArray.length)
                    firstArray[i] = mergedArray[i];
               else
                    secondArray[i % secondArray.length] = mergedArray[i];
          }
     }

     public static void printArrayValues(int[] arr) {
          System.out.print(" Array: [ ");
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : " "));
          }
          System.out.print("]");
          System.out.println();
     }

     public static void main(String[] args) {
          int[] firstArr = { 1, 5, 6, 7, 8, 10 }, secondArr = { 2, 4, 9 };
          System.out.println("First Array: ");
          printArrayValues(firstArr);
          System.out.println("Second Array: ");
          printArrayValues(secondArr);
          mergeArray(firstArr, secondArr);
          System.out.println("After Merging and Rearranging: ");
          System.out.println("First Array: ");
          printArrayValues(firstArr);
          System.out.println("Second Array: ");
          printArrayValues(secondArr);
     }
}
