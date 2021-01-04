import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesReport {
     static DecimalFormat df = new DecimalFormat("#.##");

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of sales store:");
          int totalNumOfStore = sc.nextInt();
          double[] sizeOfArray = new double[totalNumOfStore];
          storeDataEntry(sc, totalNumOfStore, sizeOfArray);
          sc.close();
     }

     public static void storeDataEntry(Scanner sc, int totalNumOfStore, double sizeOfArray[]) {
          double total = 0;
          System.out.println("Today's Sales Report");
          // to get input from users..........
          for (int i = 0; i < totalNumOfStore; i++) {
               System.out.print("Enter Today sales for store " + (i + 1) + ": ");
               sizeOfArray[i] = sc.nextDouble();
          }
          // to print the user's input data.........
          for (int i = 0; i < totalNumOfStore; i++) {
               total = sizeOfArray[i] + total;
          }
          System.out.println("Sales Bar chart (Each * = Rs. 1000)");
          // to calculate the value for bar chart...........
          for (int i = 0; i < totalNumOfStore; i++) {
               double value = sizeOfArray[i] / 1000;
               // to show in the bar chart.............
               System.out.print("Store " + (i + 1) + ": ");
               for (int j = 0; j < value; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }
          // to calculate the percentage of the sales...............
          System.out.println("Percentage of sales");
          for (int i = 0; i < totalNumOfStore; i++) {
               System.out.print("Store " + (i + 1) + ": ");
               double percentage = ((sizeOfArray[i] / total) * 100);
               Double per = Double.valueOf(percentage);
               System.out.println(df.format(per) + "%");
          }
     }
}