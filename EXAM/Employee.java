import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Employee {

     public static void main(String[] args) {
          int count = 0;
          float total = 0.0f;
          File myfile = new File("emp-data.csv");
          FileReader reader = null;
          Scanner sc;
          try {
               sc = new Scanner(myfile);
               sc.useDelimiter(",");
               while (sc.hasNext()) {
                    int salary = sc.nextInt();
                    System.out.println("Salary " + (count + 1) + " = " + salary);
                    count++;
                    total = total + salary;
               }
               sc.close();
          } catch (IOException ex) {
               ex.printStackTrace();
          }
          System.out.println("total =" + total);
          System.out.println("Count = " + count);
          System.out.println("The average salary of the " + count + " Employee =" + total / count);
     }
}
