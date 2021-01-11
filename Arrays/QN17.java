
/*
 * Write a Java Method to input a matrix A and create its transpose matrix AT
 * and print the output.
 */
import java.util.Arrays;
import java.util.Scanner;

public class QN17 {
     static int[][] getTranspose(int[][] matrix) {
          int[][] transpose = new int[matrix[0].length][matrix.length];
          for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[0].length; j++) {
                    transpose[j][i] = matrix[i][j];
               }
          }
          return transpose;
     }

     static void inputMatrix(int[][] matrix, Scanner sc) {
          int rows = matrix.length, col = matrix[0].length;
          for (int i = 0; i < rows; i++) {
               for (int j = 0; j < col; j++) {
                    matrix[i][j] = sc.nextInt();
               }
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("====================Enter the order for Matrix 1====================");
          System.out.println("Enter row: ");
          int rows = sc.nextInt();
          System.out.println("Enter column: ");
          int col = sc.nextInt();
          System.out.println("Enter the elements: ");
          int[][] matrix = new int[rows][col];
          inputMatrix(matrix, sc);
          System.out.println("Input: ");
          for (int[] i : matrix) {
               System.out.println(Arrays.toString(i));
          }
          int[][] output = getTranspose(matrix);
          System.out.println("Output: ");
          for (int[] i : output) {
               System.out.println(Arrays.toString(i));
          }
     }
}