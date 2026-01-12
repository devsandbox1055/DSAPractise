import java.util.Scanner;

public class FibonacciRecursion {

    static int fabo(int n) {
        //pehle base case

        if(n == 0) {
            return 0;

        }
        if(n == 1) {
            return 1;

        }
    //Recursive call
    return fabo(n-1) + fabo(n-2);
}

public static void main(String[] args) {
    
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter a number");
        int n = sc.nextInt();

        System.out.println("your answer = " + fabo(n));
    }
}




