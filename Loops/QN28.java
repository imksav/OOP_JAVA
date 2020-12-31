
/*
Write a short program that prints each number from 1 to 100 on a new line.
For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number. 
For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
*/
import java.util.Scanner;

public class QN28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ". FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ". Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ". Buzz");
            } else {
                System.out.println(i + ". " + i);
            }
        }
        sc.close();
    }
}
