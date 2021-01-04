/*
Define a constructor for ShowDate class that initializes the ShowDate objects with given initial values. In case the initial values are not provided, it should initialize the object with default 0 values.
*/

// import java.util.Date;
import java.util.Scanner;

public class ShowDate {
     private int year;
     private String month;
     // private int month;
     private int date;

     // constructor
     ShowDate(int year, String month, int date) {
          this.year = year;
          this.month = month;
          this.date = date;
     }

     ShowDate() {
          this.year = 0;
          this.month = "0";
          this.date = 0;
     }

     // methods
     String displayDate() {
          // System.out.println("Current Date is: " + this.date);
          String yearMonthDate = this.year + " year " + this.month + " month " + this.date + " day";
          return yearMonthDate;
     }

     public static void main(String[] args) {
          // Date date = new Date();
          // String myDate = date.toString();
          Scanner sc = new Scanner(System.in);
          System.out.println("+++++++++++Program Starts Here++++++++++++++");
          System.out.println("Enter a year:");
          int year = sc.nextInt();
          System.out.println("Enter a month(alphabet):");
          String month = sc.next();
          // int month = sc.nextInt();
          sc.nextLine();
          System.out.println("Enter a date:");
          int date = sc.nextInt();
          ShowDate sd1 = new ShowDate(year, month, date);
          ShowDate sd2 = new ShowDate();
          sd1.displayDate();
          System.out.println("Date: " + sd1.displayDate());
          sd2.displayDate();

          System.out.println("+++++++++++Program Ends Here++++++++++++++");

          sc.close();
     }

}
