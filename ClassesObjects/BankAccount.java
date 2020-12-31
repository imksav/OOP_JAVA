import java.util.Scanner;

/*
Design a class to represent a bank account. Include the following members:
Fields/Data members:
     Name of the depositor
     Account number
     Type of account
     Balance amount in the account
Methods:
     Constructor(s)
     To assign initial values
     To deposit an amount
     To withdraw an amount after checking balance
     To display the name and balance.
Test the bank account class by performing all actions defined in BankAccount class.

*/
public class BankAccount {
     String nameOfDepositor;
     String accountNumber;
     String accountType;
     double balanceAmount;

     BankAccount(String nameOfDepositor, String accountNumber, String accountType, double balanceAmount) {
          this.nameOfDepositor = nameOfDepositor;
          this.accountNumber = accountNumber;
          this.accountType = accountType;
          this.balanceAmount = balanceAmount;
     }

     // assigning initial balance
     public static double assignInitialAmount(Scanner sc) {
          System.out.println("Enter your initial balance: ");
          double initialBalance = sc.nextDouble();
          return initialBalance;
     }

     // deposit balance
     public static double depositBalance(Scanner sc, double initialBalance) {
          System.out.println("Enter the amount you want to deposit:");
          double deposited = sc.nextDouble();
          System.out.println("You have deposited Rs." + deposited + " amount in your account.");
          deposited = deposited + initialBalance;
          return deposited;
     }

     // withdraw balance
     public static double withdrawBalance(Scanner sc, double deposited) {
          System.out.println("Enter the amount you want to withdraw.");
          double withdraw = sc.nextDouble();
          if (withdraw > deposited) {
               System.out.println("You don't have enough balance.");
          } else {
               deposited = deposited - withdraw;
               System.out.println("You have withdrawn Rs." + withdraw + " balance from your account.");
          }
          return deposited;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("=======================Welcome to Hamro Ramro Nepali Bank=======================");
          double initialBalance = assignInitialAmount(sc);
          System.out.println("Your Initial Balance is Rs." + initialBalance);
          double deposited = depositBalance(sc, initialBalance);
          System.out.println("You have Rs." + deposited + " in your account.");
          deposited = withdrawBalance(sc, deposited);
          System.out.println("You have Rs." + deposited + " in your account.");
          sc.close();
     }
}
