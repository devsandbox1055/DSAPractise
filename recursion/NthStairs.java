import java.util.Scanner;

public class NthStairs {
    static int stair(int n) {
        
        //base case
        if (n ==0) return 1;
        if(n==1) return 0;
    
        //recursive call
        return stair(n-1) + stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the nth number of stairs :" );
        int n  = sc.nextInt();

        System.out.println("your answer is- " +  stair(n));
    }
    }