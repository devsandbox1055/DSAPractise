import java.util.Scanner;

public class PrintOneToN {

    static void printNumbers(int n) {
        if (n == 0) {
            return; // base condition
        }
        printNumbers(n - 1); // recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}
