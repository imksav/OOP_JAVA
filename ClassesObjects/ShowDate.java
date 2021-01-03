/*
Define a constructor for ShowDate class that initializes the ShowDate objects with given initial values. In case the initial values are not provided, it should initialize the object with default 0 values.
*/

import java.util.Date;
import java.util.Scanner;

public class ShowDate {
     private String date;

     // constructor
     ShowDate(String myDate) {
          this.date = myDate;
     }

     ShowDate() {
          this.date = "0";
     }

     // methods
     void displayDate() {
          System.out.println("Current Date is: " + this.date);
     }

     public static void main(String[] args) {
          Date date = new Date();
          String myDate = date.toString();
          Scanner sc = new Scanner(System.in);
          System.out.println("+++++++++++Program Starts Here++++++++++++++");
          ShowDate sd1 = new ShowDate(myDate);
          ShowDate sd2 = new ShowDate();
          sd1.displayDate();
          sd2.displayDate();
          System.out.println("+++++++++++Program Ends Here++++++++++++++");

          sc.close();
     }

}
