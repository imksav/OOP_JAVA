/*
Modify the implementation of area() given in the previous question using private
methods, faceArea(), topArea() and sideArea(). [Often private methods are helping methods that public methods use, but are not to be used outside the class.] Test your program.

*/

import java.util.Scanner;

public class DimensionPart2 {
     private double length;
     private double width;
     private double height;

     // constructor
     DimensionPart2(double length, double width, double height) {
          this.length = length;
          this.width = width;
          this.height = height;
     }

     DimensionPart2(double side) {
          this.length = side;
          this.width = side;
          this.height = side;
     }

     // methods
     public double volume() {
          double volume = length * width * height;
          return volume;
     }

     private double faceArea() {
          double faceArea = (length * height);
          return faceArea;
     }

     private double sideArea() {
          double sideArea = (length * width);
          return sideArea;
     }

     private double topArea() {
          double topArea = (width * height);
          return topArea;
     }

     public double area() {
          double area = (2 * (faceArea() + sideArea() + topArea()));
          return area;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the length: ");
          double length = sc.nextDouble();
          System.out.print("Enter the width: ");
          double width = sc.nextDouble();
          System.out.print("Enter the height: ");
          double height = sc.nextDouble();
          DimensionPart2 d1 = new DimensionPart2(length, width, height);
          System.out.println("Volume of cuboid having length=" + length + ", width=" + width + ", height=" + height
                    + ": " + d1.volume());
          System.out.println("Area of cuboid having length=" + length + ", width=" + width + ", height=" + height + ": "
                    + d1.area());
          DimensionPart2 d2 = new DimensionPart2(length);
          System.out.println("Volume of cube having length=" + length + ": " + d2.volume());
          System.out.println("Area of cube having length=" + length + ": " + d2.area());
          sc.close();
     }
}
