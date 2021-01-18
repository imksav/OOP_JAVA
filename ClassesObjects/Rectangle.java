
/*Create equivalent class from following UML diagram. Also test the method of each class by invoking them using main class for each.
*/
import java.util.Scanner;

public class Rectangle {
     private float length;
     private float width;

     Rectangle() {
          this(1.0f, 1.0f);
     }

     Rectangle(float length, float width) {
          this.length = length;
          this.width = width;
     }

     // setter and getter
     public void setLength(float l) {
          length = l;
     }

     public float getLength() {
          return length;
     }

     public void setWidth(float w) {
          width = w;
     }

     public float getWidth() {
          return width;
     }

     public double getArea() {
          double area = getLength() * getWidth();
          return area;
     }

     public double getPerimeter() {
          double perimeter = 2 * (getLength() + getWidth());
          return perimeter;
     }

     public String toString() {
          return String.format("Rectangle[ length= %f ,width= %f ]", length, width);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the length of a rectangle: ");
          float length = sc.nextFloat();
          System.out.println("Enter the width of a rectangle: ");
          float width = sc.nextFloat();
          // creating objects
          Rectangle r1 = new Rectangle(length, width);
          System.out.println("Area of rectangle is: " + r1.getArea());
          System.out.println("Perimeter of rectangle is: " + r1.getPerimeter());
          System.out.println("Rectangle: " + r1.toString());
          sc.close();
     }
}
