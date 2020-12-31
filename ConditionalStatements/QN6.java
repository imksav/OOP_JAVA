/*  Write a program to convert the case of character input by the user. For example, if the user inputs character ‘x’, output must be ‘X’.
*/
import java.util.Scanner;
public class QN6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to change into it's uppercase or lowercase: ");
        char ch = sc.next().charAt(0);
        char ch_duplicate = ch;
        int temp;
       System.out.println("Select in which you want to convert:\n1. Uppercase\n2. Lowercase");
       int option = sc.nextInt();
       switch (option){
           case 1:
           if(ch_duplicate>='a' && ch_duplicate<='z'){
            temp = (int)ch_duplicate;
            temp = temp -32;
            ch = (char) temp;
            System.out.println(ch_duplicate+ " equivalent in Uppercase is "+ch);
           }else{
               System.out.println("Invalid input.");
           }
            break;
            case 2:
            if(ch_duplicate>='A' && ch_duplicate<='Z'){
            temp = (int)ch_duplicate;
            temp = temp +32;
            ch = (char) temp;
            System.out.println(ch_duplicate+ " equivalent in Lowercase is "+ch);
            }
            else{
               System.out.println("Invalid input.");
            }
            break;
            default:
            System.out.println("Invalid input");
       }       
    sc.close();
    }
}