import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name = sc.nextLine();

        System.out.println("Enter Your Marks");
        float Marks = sc.nextFloat();
        sc.close();

        System.out.println("Name : " + Name);
        System.out.println("marks : " + Marks);
        
        if (Marks >= 90) {
            System.out.println("A(excellent)");
        } else if (Marks >= 80){
            System.out.println("B(Good JOB)");
        } else if (Marks >= 79){
            System.out.println("c(Keep Improving)");
        } else if(Marks >= 60){
            System.out.println("D(Needs More Effort)");
        }
        else{
            System.out.println("F(Failed, Study Harder)");
        }

        }        
}
    
