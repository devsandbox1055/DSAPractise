import java.util.Scanner;

public class GCD {

    // Euclidean theorem
    static int gcdq(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdq(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number : ");
        int a = sc.nextInt();

        System.out.print("enter the 2nd number : ");
        int b = sc.nextInt();

        int result = gcdq(a, b);

        System.out.println("GCD of both numbers is = " + result);
    }
}