import java.util.Scanner;


public class FactForLoop {
    
    static int facto(int n ){
        int ans  = 1;
        for(int i = 1; i<=n; i++) {
            ans *= i;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n  = sc.nextInt();

        System.out.println("answer is  = " + facto(n));
    }
    
}
