import java.util.ArrayList;
import java.util.Scanner;

public class TwoLargestOddNumbers {

     public static boolean checkOddPrime(int num) {
          boolean check = true;
          if (num % 2 == 0) {
               for (int i = 2; i < num / 2; i++) {
                    if (num % i == 2) {
                         check = false;
                    } else {
                         check = true;
                    }

               }
          }
          return check;

     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Boolean con = true;
          int large = 0;
          int secondLarge = 0;
          int count = 0;
          ArrayList<Integer> num = new ArrayList();
          int i = 0;
          System.out.println("Enter numbers");
          while (con == true) {
               num.add(sc.nextInt()); 
               if (num.get(i) < 0) {
                    con = false;
               }
               i++;
          }
          for (int j = 0; j < num.size(); j++) {
               if (num.get(j) > large) {
                    secondLarge = large;
                    large = num.get(j);
               } else if (num.get(j) > secondLarge) {
                    secondLarge = num.get(j);
               }
          }
          System.out.println("Total numbers keyed in are: " + (num.size() - 1));
          System.out.println("The top two largest numbers are: " + large + " " + secondLarge);

          if (checkOddPrime(large) == true) {
               System.out.println(large + " is the odd prime number ");
          } else {
               System.out.println(large + " is not odd prime number ");
          }

     }

}