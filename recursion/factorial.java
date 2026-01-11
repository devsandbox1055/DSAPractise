import java.util.Scanner;

public class factorial {

    static int factorialo(int n) {
    if(n ==0 || n == 1){
        return 1; //base case ke liye

    }
    return n * factorialo(n-1); //main recursive call

}
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter a number= " );
        int n  = sc.nextInt();

        System.out.println("Factorial = " +  factorialo(n));
        


    }
}