import java.util.Scanner;

public class InvoiceItem {

     private String id;
     private String desc;
     private int qty;
     private double unitPrice;

     InvoiceItem(String id, String desc, int qty, double unitPrice) {
          this.id = id;
          this.desc = desc;
          this.qty = qty;
          this.unitPrice = unitPrice;
     }

     public String getID() {
          return id;
     }

     public String getDesc() {
          return desc;
     }

     public void setQty(int qty) {
          this.qty = qty;
     }

     public int getQty() {
          return qty;
     }

     public void setUnitPrice(double unitPrice) {
          this.unitPrice = unitPrice;
     }

     public double getUnitPrice() {
          return unitPrice;
     }

     public double getTotal() {
          return (getUnitPrice() * getQty());
     }

     public String toString() {
          String output = String.format("InvoiceItem[id=%s,desc=%s,qty=%d,unitPrice=%f]", id, desc, qty, unitPrice);
          return output;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter id: ");
          String id = sc.nextLine();
          System.out.println("Enter desc: ");
          String desc = sc.nextLine();
          System.out.println("Enter qty: ");
          int qty = sc.nextInt();
          System.out.println("Enter unitPrice: ");
          double unitPrice = sc.nextDouble();
          InvoiceItem it1 = new InvoiceItem(id, desc, qty, unitPrice);
          System.out.println("Total: " + it1.getTotal());
          System.out.println("Result: " + it1.toString());
          sc.close();
     }
}
