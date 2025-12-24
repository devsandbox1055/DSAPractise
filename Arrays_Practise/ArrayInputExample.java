import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[5];
        int eventcount;
        int oddcount;

        System.out.println("enter 5 numbers");
        for(i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("your output=");

        for(int = 0; i<a.length; i++) {
            if(a[i]%2==0);
            eventcount++;
        }
            else {
                oddcount++;
            }
System.out.println("even count = " + eventcount);
System.out.println("odd count = " + oddcount)

}




// int[] arr  = {1,2,3 , 4};
// int max  =
// int [] a = new int[5] 
// int[] b = {10, 20 , 30};
// for(int i = 0; i <=b.length; i++) {
//     System.out.println(a[i]);

// }

// int [] a  = {1,2,3};
// for (int x : a {
//     System.out.println(x);