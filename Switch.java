import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner dy = new Scanner(System.in);

        System.out.println("Enter A Digit : ");
        int days = dy.nextInt();
        dy.close();


        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
        
            case 2 :
                System.out.println("tuesday");
                break;
            
            case 3:
                System.out.println("wednesday");
                break;

            default:
                System.out.println("weekday");
        }
    }


    
}
