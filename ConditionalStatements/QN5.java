// Write a program to test if the character input by the user is uppercase or lowercase or other character.
import java.util.Scanner;
public class QN5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        // check
        if(ch>=65 && ch<=90){
            System.out.println(ch+ " is Uppercase.");
        }
        else if(ch>=97 && ch<= 122){
            System.out.println(ch+ " is Lowercase.");
        }
        else if(ch>=33 || ch<= 64 || ch>= 91 || ch<=96 || ch>=123 || ch<=126){
            System.out.println(ch+ " is symbols.");
        }
        else{
            System.out.println(ch+ " is DELETE or SPACE or unknown words.");
        }
        sc.close();
    }
}