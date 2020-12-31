/*
Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/  
import java.util.Scanner;
public class QN20 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you have any medical cause? (Y/N)");
    String response = sc.nextLine();
    if(response.toUpperCase().equals("N")){
        System.out.println("You are allowed to sit in examination.");
    }
    else if(response.toUpperCase().equals("Y")){
        System.out.println("You are not allowed to sit in examination.");
    }
    else{
        System.out.println("Invalid input");
        }
        sc.close();
    }
}
