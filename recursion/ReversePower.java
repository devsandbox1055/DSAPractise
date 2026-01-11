import java.util.Scanner;

public class ReversePower {
    static int power(int a , int b) {

        int half   = power(a, b/2);
        
        //Power ko half karo, 
        // result ko square karo,
        // odd ho to ek extra multiply.

       if (b%2 == 0) {
        return half * half;

       } else {
        return half * half * a;

       }
    }
    //number ko reverse karne ke liye
    static int reverse(int n){
        int rev  = 0;
        while(n>0){
        rev  = rev *10 +(n%10);
        n = n/10;

    }
    return rev;
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int rev = reverse(n);
        int ans = power(n, rev);

        System.out.println("Reverse = " + rev);
        System.out.println("Result = " + ans);
    }
}