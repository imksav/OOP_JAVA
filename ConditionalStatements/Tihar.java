import java.util.Scanner;

public class Tihar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Still COVID-19 exist? ");
        String response1 = sc.next();
        if(response1.toLowerCase().equals("y")){
            System.out.println("Did we get any medicine for COVID-19? ");
            String response2=sc.next();
            if(response2.toLowerCase().equals("n")){
                System.out.println("No celebration for any festival that creates huge mass.");
            }
            else{
                System.out.println("Celebrate with family members only maintaining precautions.");
            } 
        }
        else{
            System.out.println("Let's celebrate festivals in discipline way. HAPPY TIHAR!!!");
        }
        sc.close();     
    }
}
