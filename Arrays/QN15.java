
/*
 * Write a Java Method to add two matrices of the same size.
 */
import java.util.Arrays;

public class QN15 {
     static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
          int[][] sum = new int[matrix1.length][matrix1[0].length];
          for (int i = 0; i < matrix1.length; i++) {
               for (int j = 0; j < matrix1[0].length; j++) {
                    sum[i][j] += matrix1[i][j] + matrix2[i][j];
               }
          }
          return sum;
     }

     public static void main(String[] args) {
          int[][] matrix1 = { { 1, 3, 5 }, { 2, 4, 6 } }, matrix2 = { { 2, 4, 6 }, { 1, 3, 5 } };
          System.out.println("Initial Matrices: ");
          System.out.println("First Matrix: ");
          for (int[] i : matrix1) {
               System.out.println(Arrays.toString(i));
          }
          System.out.println("Second Matrix: ");
          for (int[] i : matrix2) {
               System.out.println(Arrays.toString(i));
          }
          System.out.println("The sum of two matrices is: ");
          int[][] sum = addMatrix(matrix1, matrix2);
          for (int[] i : sum) {
               System.out.println(Arrays.toString(i));
          }
     }
}
