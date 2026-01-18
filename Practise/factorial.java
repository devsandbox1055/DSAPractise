import java.util.Scanner;

public class factorial {

    static int fac(int n){
        //base case
        if(n == 0 || n== 1){
            return 1;

        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();

        System.out.println("factorial of n  = " + fac(n));
    }
}
    

