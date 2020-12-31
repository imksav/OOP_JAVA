/*
13.Write Java methods to calculate the area of a triangle. 
Expected Output:
Input Side-1: 10                                                                               
Input Side-2: 15                                                                               
Input Side-3: 20                                                                              
The area of the triangle is 72.6184377413890 
*/

import java.util.Scanner;

public class QN13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of traingle: ");
        int size = sc.nextInt();
        double area = areaOfTriangle(size, sc);
        System.out.println("Area of triangle is: " + area);
        sc.close();
    }

    static double areaOfTriangle(int size, Scanner sc) {
        float[] sides = new float[size];
        double area;
        double sum = 0;
        System.out.println("Enter the value of each side: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Side-" + (i + 1) + ": ");
            sides[i] = sc.nextFloat();
            sum = sum + sides[i];
        }
        double perimeter = sum / 2;
        area = Math.sqrt(perimeter * (perimeter - sides[0]) * (perimeter - sides[1]) * (perimeter - sides[2]));
        return (area);
    }
}