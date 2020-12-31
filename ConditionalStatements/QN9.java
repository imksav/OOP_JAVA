/*
An electronics shop has announced the following seasonal discounts on the purchase of certain items.
Purchase Amount in Rs.      Discount on Laptops        Discount on Desktop PC
0 - 25,000                      0.0%                        5.0%
25,001 – 57,000                 5.0%                        7.5%
57,001 – 1,00,000               7.5%                        10.0%
More than 1,00,000              10.0%                       15.0%
*/
import java.util.Scanner;
public class QN9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out
                .println("What do you want to buy? Press the product tyype:\n For Laptop ==> L\n For Desktop PC ==> D");
        String type = sc.next();
        if (type.toLowerCase().equals("l")) {
            System.out.println("Enter the amount of Laptop: ");
            double laptop_amount = sc.nextDouble();
            if (laptop_amount < 25000) {
                double discount = 0.00 * laptop_amount;
                double net_amount = laptop_amount - discount;
                System.out.println("Total amount of laptop is: " + net_amount);
            } else if (laptop_amount >= 25001 && laptop_amount <= 57000) {
                double discount = 0.05 * laptop_amount;
                double net_amount = laptop_amount - discount;
                System.out.println("Total amount of laptop is: " + net_amount);
            } else if (laptop_amount >= 57001 && laptop_amount <= 100000) {
                double discount = 0.075 * laptop_amount;
                double net_amount = laptop_amount - discount;
                System.out.println("Total amount of laptop is: " + net_amount);
            } else {
                double discount = 0.10 * laptop_amount;
                double net_amount = laptop_amount - discount;
                System.out.println("Total amount of laptop is: " + net_amount);
            }
        } else if (type.toLowerCase().equals("d")) {
            System.out.println("Enter the amount of Desktop PC: ");
            double desktop_amount = sc.nextDouble();
            if (desktop_amount < 25000) {
                double discount = 0.05 * desktop_amount;
                double net_amount = desktop_amount - discount;
                System.out.println("Total amount of Desktop PC is: " + net_amount);
            } else if (desktop_amount >= 25001 && desktop_amount <= 57000) {
                double discount = 0.075 * desktop_amount;
                double net_amount = desktop_amount - discount;
                System.out.println("Total amount of Desktop PC is: " + net_amount);
            } else if (desktop_amount >= 57001 && desktop_amount <= 100000) {
                double discount = 0.10 * desktop_amount;
                double net_amount = desktop_amount - discount;
                System.out.println("Total amount of Desktop PC is: " + net_amount);
            } else {
                double discount = 0.15 * desktop_amount;
                double net_amount = desktop_amount - discount;
                System.out.println("Total amount of Desktop PC is: " + net_amount);
            }
        } else {
            System.out.println("You have entered invalid type.");
        }
        sc.close();
    }
}