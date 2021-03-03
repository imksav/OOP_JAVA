import java.util.Scanner;

public class TwoLarge {

     public static boolean checkOddPrime(int num) {
          boolean check = true;
          if (num % 2 == 0) {
               for (int i = 2; i < num / 2; i++) {
                    if (num % i == 2) {
                         check = true;
                    } else {
                         check = false;
                    }

               }
          }
          return check;
     }

     public static void main(String[] args) {
          int large = 0;
          int secondLarge = 0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Number you inter you want to enter :");
          int n = sc.nextInt();

          int num[] = new int[n];
          int count = 0;
          System.out.println("Enter integer ");
          for (int i = 0; i < n; i++) {
               num[i] = sc.nextInt();
               if (num[i] >= 0) {
                    count++;
                    for (int j = 0; j < n - 1; j++) {
                         if (num[j] > num[j + 1]) {
                              int temp = num[j];
                              num[j] = num[j + 1];
                              num[j + 1] = temp;
                         }
                    }
               } else {
                    break;
               }
          }
          large = +num[num.length - 1];
          secondLarge = +num[num.length - 2];
          System.out.println("Total numbers keyed in are " + count);
          System.out.println("top 2 largest number are :" + large + " , " + secondLarge);
       

     }

}