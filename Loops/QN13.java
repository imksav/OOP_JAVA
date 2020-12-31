
/*
13.Write a Java program to display the number rhombus structure.
Test Data
	Input the number: 7
	Expected Output :                          
      1                                                  
     212                                                 
    32123                                                
   4321234                                               
  543212345                                              
 65432123456                                             
7654321234567                                            
 65432123456                                             
  543212345                                              
   4321234                                               
    32123                                                
      212                                                 
       1
*/
import java.util.Scanner;

public class QN13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numOfRows = sc.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (numOfRows * 2); i++) {

            for (int spc = numOfRows - no_of_spaces; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < numOfRows) {
                start = i; // for number
                no_of_spaces++; // for spaces
            } else {
                start = numOfRows * 2 - i; // for number
                no_of_spaces--; // for space
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < numOfRows) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
        sc.close();
    }
}
