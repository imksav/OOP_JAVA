/*
Write a Java program that input a number from the user and checks if the number is between 1-7 or not. If the number is not between 1-7, your program should make the number fall in the range, then displays the name of the weekday.
Sample Output:
input: 4 Output: Wednesday
input: 10 Output: Tuesday
(Use if else to check the range and switch case to display the week day.)
*/
import java.util.Scanner;
public class QN18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        int num2;
        if(num1%7!=0){
           num2= num1%7;
        }
        else{
           num2=((num1%7)+7);
        }
        switch (num2) {
            case 1:
                System.out.println("input: "+num1+ " output: Sunday");
                break;
            case 2:
                System.out.println("input: "+num1+ " output: Monday");
                break;
            case 3:
                System.out.println("input: "+num1+ " output: Tuesday");
                break;
            case 4:
                System.out.println("input: "+num1+ " output: Wednesday");
                break;
            case 5:
                System.out.println("input: "+num1+ " output: Thursday");
                break;
            case 6:
                System.out.println("input: "+num1+ " output: Friday");
                break;
            case 7:
                System.out.println("input: "+num1+ " output: Saturday");
                break;
            default:
            System.out.println("Invalid input.");
                break;
        }
        sc.close();
    }
}
