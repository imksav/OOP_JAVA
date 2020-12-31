/*
Write a program to input the three sides of triangle and check if the sides of triangle are valid or not. If the triangle is valid, print its type (scalene, isosceles, equilateral).
*/
import java.util.Scanner;
public class QN31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc .nextDouble();
        double side3 = sc.nextDouble();
        if((side1+side2)>side3 || (side1+side3)>side2 || (side2+side3)>side1){
            System.out.println("The triangle is valid.");
            if(side1==side2 && side2==side3 && side3==side1){
                System.out.println("The triangle is equilateral.");
            }
            else if(side1==side2 || side2==side3 || side3==side1){
                System.out.println("The triangle is isosceles.");
            }
            else{
                System.out.println("The triaangle is scalene.");
            }
        }
        else{
            System.out.println("The triangle is not valid.");
        }
        sc.close();
    }
}
