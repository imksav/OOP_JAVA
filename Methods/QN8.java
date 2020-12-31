
/*
Write a Java method to compute the future investment value at a given
 interest rate for a specified number of years. Formula for calculation of
 future amount= p*〖(1+r/n)〗^nt , is number of time interest is calculated per
 unit time t, r is rate in decimal. Sample data (Monthly compounded) and
 Output: 
 Input the investment amount: 1000
 Input the rate of interest: 10
 Input number of years: 5
 Expected Output:
 Years FutureValue
 1      1104.71
 2      1220.39
 3      1348.18
 4      1489.35
 5      1645.31
 */
import java.text.DecimalFormat;
import java.util.Scanner;

class QN8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the investment amount:");
        double amount = sc.nextDouble();
        System.out.println("Enter the rate:");
        float rate = sc.nextFloat();
        System.out.println("Enter number of years:");
        int year = sc.nextInt();
        System.out.println("Years\t\tFutureValue");
        futureValue(amount, rate, year);
        sc.close();
    }

    public static void futureValue(double amount, float rate, int year) {
        int n = 12;
        for (int i = 1; i <= year; i++) {
            double futureValue = amount * (Math.pow(1 + ((rate / 100) / n), (n * i)));
            DecimalFormat myFormatter = new DecimalFormat(".##");
            System.out.println(i + "\t\t" + myFormatter.format(futureValue));
        }
    }
}