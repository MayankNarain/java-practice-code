import java.util.Scanner;
public class Input {
        public static void main(String[] args) {
            System.out.println("Bank Account Details");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Account number : ");
            String AccountHolder = sc.nextLine();
            System.out.println("Enter Account Balance : ");
            Double AccountBalance = sc.nextDouble();
            System.out.println("Enter Intrest Rate : ");
            float intrestRate = sc.nextFloat();
            System.out.println("Enter Currency Symbol : ");
            char CurrencySymbol = sc.next().charAt(0);
            System.out.println("Is the Account Active : ");
            boolean AccountStatus = sc.nextBoolean();
            sc.close();
            
            System.out.println("\n---Account Details----");
            System.out.println("account holder : " + AccountHolder);
            System.out.println("account balance :" + CurrencySymbol +" "+ AccountBalance);
            System.out.println("intrest rate : " + intrestRate);
            System.out.println("staturs : " + AccountStatus);
        
    }
}

