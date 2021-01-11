/*
Write a java program to take a 2d array input from user and print the sum of each row, column and total sum in as shown below:
     input:
          1 3 5 
          2 4 6 
     output:
          1 3 5 9
          2 4 6 12
          3 7 11 21 

*/

import java.util.Scanner;
import java.util.Arrays;

public class QN14 {
     public static int[][] getSum(int[][] matrix) {
          int[][] finalMatrix = new int[matrix.length + 1][matrix[0].length + 1];
          int totalSum = 0;
          for (int i = 0; i < matrix.length; i++) {
               int sumRow = 0;
               for (int j = 0; j < matrix[0].length; j++) {
                    finalMatrix[i][j] = matrix[i][j];
                    sumRow += matrix[i][j];
               }
               // adding the row sum...............
               finalMatrix[i][finalMatrix[0].length - 1] = sumRow;
               totalSum += sumRow;
          }
          for (int i = 0; i < matrix[0].length; i++) {
               int sumCol = 0;
               for (int[] num : matrix) {
                    sumCol += num[i];
               }
               // adding the col sum..................
               finalMatrix[finalMatrix.length - 1][i] = sumCol;
          }
          finalMatrix[finalMatrix.length - 1][finalMatrix[0].length - 1] = totalSum;
          return finalMatrix;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number of rows: ");
          int rows = sc.nextInt();
          System.out.print("Enter the number of columns: ");
          int col = sc.nextInt();
          int[][] matrix = new int[rows][col];
          System.out.print("Insert the values for each rows: ");
          for (int i = 0; i < rows; i++) {
               for (int j = 0; j < col; j++) {
                    matrix[i][j] = sc.nextInt();
               }
          }
          int[][] finalMatrix = getSum(matrix);
          System.out.println("Final Matrix is: ");
          for (int[] num : finalMatrix) {
               System.out.println(Arrays.toString(num));
          }
          sc.close();
     }
}