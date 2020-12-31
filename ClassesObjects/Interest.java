
/*
 * Write a program that implements Interest class which stores three variables
 * principal, rate and time and calculates simple interest. Create parameterized
 * constructor to initialize the variables. Also define getters and setter for
 * all variable. Write main method to test the class.
 */
import java.util.Scanner;

public class Interest {
     double principal;
     float rate;
     float year;

     Interest(double principal, float rate, float year) {
          this.principal = principal;
          this.rate = rate;
          this.year = year;
     }

     // setter for principal
     public void setPrincipal(double principal) {
          this.principal = principal;
     }

     // setter for rate
     public void setRate(float rate) {
          this.rate = rate;
     }

     // setter for year
     public void setYear(float year) {
          this.year = year;
     }

     // getter for principal
     public double getPrincipal() {
          return this.principal;
     }

     // getter for rate
     public float getRate() {
          return this.rate;
     }

     // getter for year
     public float getYear() {
          return this.year;
     }

     public static double calculateInterest(double p, float r, float y) {
          double simpleInterest = ((p * r * y) / 100);
          return simpleInterest;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter principal: ");
          double principal = sc.nextDouble();
          System.out.println("Enter rate: ");
          float rate = sc.nextFloat();
          System.out.println("Enter year");
          float year = sc.nextFloat();
          Interest i1 = new Interest(principal, rate, year);
          i1.setPrincipal(principal);
          i1.setRate(rate);
          i1.setYear(year);
          double p = i1.getPrincipal();
          float r = i1.getRate();
          float y = i1.getYear();
          System.out.println("Simple Interest is Rs." + calculateInterest(p, r, y));
          sc.close();
     }
}