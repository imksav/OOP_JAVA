/*Write a program to input the annual income from user and compute the tax according to the given conditions and display the total tax:
Total Annual Taxable Income	   	    Tax Rate
Upto Rs.1,00,000			        No tax
From 1,00,001 to 1,50,000	        10% of the income exceeding Rs.1,00,000
From 1,50,000 to 2,50,000	        Rs.5000 +20% of the income exceeding Rs.1,50,000
Above Rs.2,50,000		            Rs.25,000 +30% of the income exceeding Rs.2,50,000
*/
import java.util.Scanner;
public class QN7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income: ");
        double income = sc.nextDouble();
        if (income <= 100000) {
            double tax = 0.00 * income;
            System.out.println("Your total tax amount is : " + tax);
        } else if (income >= 100001 && income <= 150000) {
            double tax = 0.10 * income;
            System.out.println("Your total tax amount is : " + tax);
        } else if (income >= 150000 && income <= 250000) {
            double tax = 5000 + (0.20 * income);
            System.out.println("Your total tax amount is : " + tax);
        } else {
            double tax = 25000 + (0.30 * income);
            System.out.println("Your total tax amount is : " + tax);
        }
        sc.close();
    }
}
