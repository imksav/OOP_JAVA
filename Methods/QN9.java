/*
Write a Java method to print characters between two characters (i.e. A to P ). 
Note: Prints 20 characters per line
Expected Output:
( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;                  
< = > ? @ A B C D E F G H I J K L M N O                  
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c                  
d e f g h i j k l m n o p q r s t u v w                  
x y z
*/

import java.util.Scanner;

public class QN9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first character:");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter second character:");
        char ch2 = sc.next().charAt(0);
        displayCharacters(ch1, ch2);
        sc.close();
    }

    static void displayCharacters(char ch1, char ch2) {
        int count = 0;
        char ch;
        for (int i = ch1; i <= ch2; i++) {
            ch = (char) i;
            count++;
            System.out.print(ch);
            if (count % 20 == 0) {
                System.out.println();
            }
        }
    }
}
