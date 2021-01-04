
/*
Write a class Circle with a parameterized constructor. If no parameters are passed then its default constructor should be invoked parameterized constructor with default values. A circle is defined using radius and circumference.
*/
import java.util.Scanner;

public class Circle {
     private double radius;
     private double circumference;

     Circle(double radius) {
          this.radius = radius;
     }

     Circle() {
          this(0);
     }

     // setter and getter
     // setter
     public void setRadius(double radius) {
          this.radius = radius;
     }

     // getter
     public double getRadius() {
          return this.radius;
     }

     // methods
     public void displayCircumference() {
          circumference = 2 * (22 / 7) * radius;
          System.out.println("Circumference of a circle is: " + circumference);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter value of radius:");
          double radius = sc.nextDouble();
          Circle c1 = new Circle(radius);
          Circle c2 = new Circle();
          c1.displayCircumference();
          c2.displayCircumference();

          sc.close();
     }
}
