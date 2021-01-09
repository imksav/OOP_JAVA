
/*
Write a program to implement a Book class that stores the details of a book namely, bookcode, name of the book, name of the author(s) and price. The class has methods to display any of the details individually.
*/
import java.util.Scanner;

public class Book {
     String bookName;
     String bookCode;
     double price;
     String author[];

     // constructor
     Book(String bookName, String bookCode, int numOfAuthor, double price) {
          this.bookName = bookName;
          this.bookCode = bookCode;
          this.author = new String[numOfAuthor];
          this.price = price;
     }

     // setter
     public void setBookName(String bookName) {
          this.bookName = bookName;
     }

     public void setBookCode(String bookCode) {
          this.bookCode = bookCode;
     }

     public void setAuthor(Scanner sc) {
          System.out.println("Enter the name of author(s): ");
          for (int i = 0; i < author.length; i++) {
               this.author[i] = sc.nextLine();
          }
     }

     public void setPrice(double price) {
          this.price = price;
     }

     // getter
     public String getBookName() {
          return bookName;
     }

     public String getBookCode() {
          return bookCode;
     }

     public String getAuthor() {
          String totalAuthor = "";
          for (int i = 0; i < this.author.length; i++) {
               totalAuthor = totalAuthor + (author[i] + ",");
               System.out.println("Author[" + i + "]: " + this.author[i]);
          }
          return totalAuthor;
     }

     public double getPrice() {
          return price;
     }

     // methods
     // display
     public void displayBookName() {
          System.out.println("Book Name: " + getBookName());
     }

     public void displayBookCode() {
          System.out.println("Book Code: " + getBookCode());
     }

     public void displayAuthor() {
          System.out.println("Author(s): " + getAuthor());
     }

     public void displayPrice() {
          System.out.println("Price: " + getPrice());
     }

     public static void main(String[] args) {
          int i;
          Scanner sc = new Scanner(System.in);
          System.out.println("----------------------User Input Starts---------------------");
          System.out.println("Enter a book name: ");
          String bookName = sc.nextLine();
          System.out.println("Enter a book code: ");
          String bookCode = sc.nextLine();
          System.out.println("Enter a number of author: ");
          int numOfAuthor = sc.nextInt();
          sc.nextLine();
          System.out.println("Enter an author(s) name: ");
          String[] author = new String[numOfAuthor];
          for (i = 0; i < author.length; i++) {
               author[i] = sc.nextLine();
          }
          System.out.println("Enter the price of book[" + bookName + "]: ");
          double price = sc.nextDouble();
          System.out.println("==============Program Strats===============");
          Book b1 = new Book(bookName, bookCode, numOfAuthor, price);
          b1.displayBookName();
          b1.displayBookCode();
          b1.displayAuthor();
          b1.displayPrice();
          System.out.println("==========================Program End==========================");
          sc.close();
     }
}
