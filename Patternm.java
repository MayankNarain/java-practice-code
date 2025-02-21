import java.util.Scanner;
public class Patternm {              // m symbol
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        sc.close();
        
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=n ; j++){
                if (i <= n/2+1) {
                    if (i == j || j == (n-i+1) || j == 1 || j == n){
                        System.out.print(" 8 ");
                    }else{
                        System.out.print("   ");
                    }

                } else{
                    if( j == 1 || j == n){
                    System.out.print(" 8 ");
                    }else{System.out.print("   ");
                        
                    }
                }
            }
            System.out.println();
        }

    }
    
}
