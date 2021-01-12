
/*
Write a Java Method to replace each element of the array with product of every other element in a given array of integers.
Example:
     Input :
          nums1 = { 1, 2, 3, 4, 5, 6, 7}
          nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
     Output:
          Array with product of every other element:
          [5040, 2520, 1680, 1260, 1008, 840, 720]
          Array with product of every other element:
          [5040, 0, 0, 0, 0, 0, 0, 0]

*/
import java.util.Arrays;

class QN36 {
     // Function to replace each element of the array with product
     // of every other element without using division operator
     public static void findProduct(int[] nums1, int[] nums2) {
          int n = nums1.length;
          int m = nums2.length;

          // use two auxiliary arrays
          int[] left1 = new int[n];
          int[] right1 = new int[n];

          // part1...................
          // left[i] stores the product of all elements in the sub-array[0..i-1]
          left1[0] = 1;
          for (int i = 1; i < n; i++) {
               left1[i] = nums1[i - 1] * left1[i - 1];

          }

          // right[i] stores the product of all elements in sub-array[i+1..n-1]
          right1[n - 1] = 1;
          for (int j = n - 2; j >= 0; j--) {
               right1[j] = nums1[j + 1] * right1[j + 1];

          }

          // replace each element with product of its left and right sub-array
          for (int i = 0; i < n; i++) {
               nums1[i] = left1[i] * right1[i];
          }
          // part2...............
          // use two auxiliary arrays

          int[] left2 = new int[m];
          int[] right2 = new int[m];

          // left[i] stores the product of all elements in the sub-array[0..i-1]
          left1[0] = 1;
          left2[0] = 1;
          for (int i = 1; i < m; i++) {
               left2[i] = nums2[i - 1] * left2[i - 1];

          }

          // right[i] stores the product of all elements in sub-array[i+1..n-1]
          right2[m - 1] = 1;
          for (int j = m - 2; j >= 0; j--) {
               right2[j] = nums2[j + 1] * right2[j + 1];

          }

          // replace each element with product of its left and right sub-array
          for (int i = 0; i < m; i++) {
               nums2[i] = left2[i] * right2[i];
          }
     }

     public static void main(String[] args) {
          int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
          int[] nums2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
          System.out.println("Initial Array 1: " + Arrays.toString(nums1));
          System.out.println("Initial Array 2: " + Arrays.toString(nums2));

          findProduct(nums1, nums2);

          // print the modified array
          System.out.println("Product Array 1: " + Arrays.toString(nums1));
          System.out.println("Product Array 2: " + Arrays.toString(nums2));

     }
}