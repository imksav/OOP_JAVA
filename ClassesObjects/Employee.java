import java.util.Scanner;

public class Employee {
     private int id;
     private String firstName;
     private String lastName;
     private int salary;

     Employee(int id, String firstName, String lastName, int salary) {
          this.id = id;
          this.firstName = firstName;
          this.lastName = lastName;
          this.salary = salary;
     }

     public int getId() {
          return id;
     }

     public String getFirstName() {
          return firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public String getName() {
          return getFirstName() + " " + getLastName();
     }

     public void setSalary(int salary) {
          this.salary = salary;
     }

     public int getSalary() {
          return salary;
     }

     public int getAnnualSalary() {
          return (salary * 12);
     }

     public void raiseSalary(int percent) {
          salary = salary + ((percent * salary) / 100);
     }

     public String toString() {
          String output = String.format("[id=%d, name=%s, salary=%d]", id, getName(), getSalary());
          return output;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your id: ");
          int id = sc.nextInt();
          sc.nextLine();
          System.out.println("Enter your first name: ");
          String firstName = sc.nextLine();
          System.out.println("Enter your last name: ");
          String lastName = sc.nextLine();
          System.out.println("Enter your basic salary: ");
          int salary = sc.nextInt();
          Employee e1 = new Employee(id, firstName, lastName, salary);
          System.out.println("Enter by how much(%) you want to raise the salary of " + e1.getName() + "? ");
          int percent = sc.nextInt();
          e1.raiseSalary(percent);
          System.out.println("Salary: " + e1.toString());
     }
}
