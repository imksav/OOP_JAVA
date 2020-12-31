/*
Write a program to compute the area of a:
i.Rectangle (length * breadth)
ii.Circle (PI  * r^2), use standard value for 
iii.Square (side * side)
Display a menu to output the area as per the user’s choice.
*/
import java.util.Scanner;
public class QN10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.142857143;
        System.out.println("Enter the value of length, breadth, radius, side: ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        float radius = sc.nextFloat();
        float side = sc.nextFloat();
        float areaOfRectangle = length * breadth;
        double areaOfCircle = PI * radius * radius;
        float areaOfSquare = side * side;
        System.out.println("=======================");
        System.out.println("Whose area would you like to display? Enter 1/2/3.\n1. Rectangle\n2. Circle\n3. Square");
        int sn=sc.nextInt();
        switch(sn){
            case 1:
            System.out.println("Area of rectangle: " + areaOfRectangle);
            break;
            case 2:
            System.out.println("Area of circle: " + areaOfCircle);
            break;
            case 3: 
            System.out.println("Area of square: " + areaOfSquare);
            break;
            default:
            System.out.println("Invalid selection.");
        }
        sc.close();
    }
}
