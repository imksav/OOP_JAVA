
/*
Implement a class called Dimension based on the following information:
Constructors
     Dimension(double length, double width, double height)
     Dimension(double side)

Methods
     double volume() // length*width*height
     double area() // 2*(length*width+width*height+height*length)
Make all the instance variables private so that they can be accessed only by the methods defined within the class. Make the methods public. Test your program.

*/
import java.util.Scanner;

public class Dimension {
     private double length;
     private double width;
     private double height;

     // constructor
     Dimension(double length, double width, double height) {
          this.length = length;
          this.width = width;
          this.height = height;
     }

     Dimension(double side) {
          this.length = side;
          this.width = side;
          this.height = side;
     }

     // methods
     public double volume() {
          double volume = length * width * height;
          return volume;
     }

     public double area() {
          double area = (2 * (length * width + width * height + height * length));
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
          Dimension d1 = new Dimension(length, width, height);
          System.out.println("Volume of cuboid having length=" + length + ", width=" + width + ", height=" + height
                    + ": " + d1.volume());
          System.out.println("Area of cuboid having length=" + length + ", width=" + width + ", height=" + height + ": "
                    + d1.area());
          Dimension d2 = new Dimension(length);
          System.out.println("Volume of cube having length=" + length + ": " + d2.volume());
          System.out.println("Area of cube having length=" + length + ": " + d2.area());
          sc.close();
     }
}
