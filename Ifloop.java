import java.util.Scanner;
public class Ifloop {
    public static void main(String[] args) {
        System.out.println("Enter A Number :  ");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        sc.close();
        if (number >= 8){
            System.out.println("its working");
        }
        else{
            System.out.println("its still working yiu just entered lesser value than 8");
        }
    
    }
}
