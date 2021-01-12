/*
Write a Java Method to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side.

*/
public class QN27 {
     public static void printLeaders(int[] arr) {
          StringBuilder LEADERS = new StringBuilder("");
          for (int i = 0; i < arr.length; i++) {
               boolean greater = false;
               for (int j = i; j < arr.length - 1; j++) {
                    if (arr[i] > arr[j + 1]) {
                         greater = true;
                    } else {
                         greater = false;
                         break;
                    }
               }
               if (greater)
                    LEADERS.append(arr[i]).append(" ");
          }
          System.out.println("The leaders of the array are:" + LEADERS.toString());
     }

     public static void printArrVals(int[] arr) {
          System.out.print("[ ");
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : " "));
          }
          System.out.print("]\n");
     }

     public static void main(String[] args) {
          int[] arr = { 15, 20, 10, 8, 9, 4, 3, 16, 14 };
          System.out.print("Initial Array: ");
          printArrVals(arr);
          printLeaders(arr);
     }
}
