import java.util.Scanner;

public class PowerAandB {

    static int power(int a , int b) {
        if(b == 0) {
            return 1;

        }
        return a*power(a,b-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: " );
        int a  = sc.nextInt();
        System.out.println("enter b :" );
        int b = sc.nextInt();

        System.out.println("result = " + power(a,b));
    }
}


