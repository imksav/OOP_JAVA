/*
A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/
import java.util.Scanner;
public class QN19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of classes held: ");
        float classHeld= sc.nextFloat();
        System.out.println("Enter the total number of classes you attend: ");
        float classAttend= sc.nextFloat();
        // Calculate percentage
        System.out.println("===============================================");
        System.out.println("Total number of classes you have attended: "+classAttend+".");
        System.out.println("Total number of classes held: "+classHeld+".");

        float attendancePercentage = (classAttend/classHeld)*100;
        System.out.println("You have attended "+attendancePercentage+ "% class.");
        if(attendancePercentage>=75){
            System.out.println("You are allowed to attend the examination.");
        }
        else{
            System.out.println("You are not allowed to attend the examination.");
        }
sc.close();
    }
}
