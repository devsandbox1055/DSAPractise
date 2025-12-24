import java.util.Scanner;

public class classprac {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        //size of an array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        //making of an array
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        //elements of first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy logic
        for(int i = 0; i<n;i++) {
            arr2[i] = arr1[i];

        }        

        System.out.print("entered array:");
        for(int i=0;i<n;i++) {
            System.out.println(arr2[i] + " ");

        }
    }

        sc.close();
    }
