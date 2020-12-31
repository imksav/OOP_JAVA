
/*
Define a class Student as described below:
Instance variables:
     name, age, marks in three subjects (m1, m2, m3), maximum and average.
Methods:
     i.  A parameterized constructor to initialize the instance variables.
     ii. To accept the details of a student.
     iii. To compute the average and minimum out of the three marks.
     iv. To display the name, age, marks in the three subjects, minimum and average.
     v. Write a main method to create an object of the class and call the above methods.
*/
import java.util.Scanner;

public class Student {
     String name;
     int age;
     float marks;
     double maximum;
     double average;

     Student(String name, int age, float marks, double maximum, double average) {
          this.name = name;
          this.age = age;
          this.marks = marks;
          this.maximum = maximum;
          this.average = average;
     }

     // adding students details
     public static void addStudentsDetails(Scanner sc) {
          System.out.println("Enter the student's name:");
          String stdName = sc.nextLine();
          System.out.println("Enter the age of the student's age:");
          int age = sc.nextInt();
          // academicDetails(sc);
     }

     // adding academic details
     public static double academicDetails(Scanner sc) {
          System.out.println("Enter the number of subjects:");
          int numofSubject = sc.nextInt();
          float marks[] = new float[numofSubject];
          double totalMarks = 0;

          System.out.println("Enter the marks in different subjects:");
          // marks entry
          for (int i = 0; i < marks.length; i++) {
               System.out.print("Marks[" + (i + 1) + "]: ");
               marks[i] = sc.nextFloat();
          }
          // displaying the marks

          for (int i = 0; i < marks.length; i++) {
               totalMarks = marks[i] + totalMarks;
               System.out.println("marks[" + (i + 1) + "]: " + marks[i]);
          }
          // finding average marks
          double average = (totalMarks / marks.length);
          return average;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          addStudentsDetails(sc);
          // academicDetails(sc);
          System.out.println("Average marks:" + academicDetails(sc));
          sc.close();
     }
}
