
/*
 * Write a program that implements Interest class which stores three variables
 * principal, rate and time and calculates simple interest. Create parameterized
 * constructor to initialize the variables. Also define getters and setter for
 * all variable. Write main method to test the class.
 */
import java.util.Scanner;

public class Interest {
     private double principal;
     private float rate;
     private float time;

     Interest(double principal, float rate, float time) {
          this.principal = principal;
          this.rate = rate;
          this.time = time;
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
     public void setYear(float time) {
          this.time = time;
     }

     // getter for principal
     public double getPrincipal() {
          // this.principal is not compulsory as principal is set to principal variable on
          // main class
          return this.principal;

     }

     // getter for rate
     public float getRate() {
          return this.rate;
     }

     // getter for year
     public float getYear() {
          return this.time;
     }

     // public static double calculateInterest(double p, float r, float t) {
     // double simpleInterest = ((p * r * t) / 100);
     // return simpleInterest;
     // }
     // not to use
     public double calculateInterest() {
          double simpleInterest = ((principal * rate * time) / 100);
          return simpleInterest;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter principal: ");
          double principal = sc.nextDouble();
          System.out.println("Enter rate: ");
          float rate = sc.nextFloat();
          System.out.println("Enter time");
          float time = sc.nextFloat();
          Interest i1 = new Interest(principal, rate, time);
          // when we don't know any variable then we use this way
          // i1.setPrincipal(principal);
          // i1.setRate(rate);
          // i1.setYear(time);
          // double p = i1.getPrincipal();
          // float r = i1.getRate();
          // float t = i1.getYear();
          System.out.println("Simple Interest is Rs." + i1.calculateInterest());
          sc.close();
     }
}