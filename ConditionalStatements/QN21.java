/*
Write a Java program to solve quadratic equations (use if, else if and else). Hint: The equation is ax2 + bx + c=0, Take a, b, c as input from user. There are three nature of root of a quadratic equation. imaginary, real and equal, real and unequal. Write complete code for all possible cases. In case of imaginary number display the roots are imaginary (you need not calculate the root).
Hint: x1,x2=, b2-4ac is called determinant of the root
a.if b2<4ac roots are imaginary
b.else if b2>4ac roots are real
*/
import java.util.Scanner;
public class QN21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number as a, b, c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b*b<4*a*c){
            System.out.println("The roots are imaginary.");
        }
        else if(b*b>4*a*c){
            System.out.println("The roots are real and unequal");
        }
        else if(b*b==4*a*c){
            System.out.println("The roots are real and equal.");
        }
        else{
            System.out.println("Mathematical Errors.");
        }

        sc.close();
    }
}
