import java.util.Scanner;

public class PowerOfTwo { 
    static boolean pow(int n) {
         if (n == 1) return true;
         
         if (n <= 0 || n % 2 != 0) 
            return false;
        return pow(n / 2);        
        
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int n = sc.nextInt();

        if (pow(n)) {
            System.out.println (n + "is a power of two");

        } else {
            System.out.println( n + " is not a power of two");
        }

    }
}