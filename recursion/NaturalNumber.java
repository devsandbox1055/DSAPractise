import java.util.Scanner;

public class NaturalNumber {
    public static int findsum(int n){
        if(n==1) return 1;
        return n + findsum(n-1);    
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter a number upto-" ); 
        int n = sc.nextInt();

        System.out.println("your sum is = " + findsum(n) );
        

    }
}
