//Question: Using Bubble Sort logic, check whether the
//array is already sorted or not.
public class SortingP2 {
    public static void main(String[] args) {
        int[] arr  = {1,3,4,6,7}
        boolean IsSorted = true;

        for(int i = 0; i<arr.length;i++) {
            if(arr[i]>arr[i+1]) {
                IsSorted = false;
                break;


            }
        }
        if(IsSorted) {
            System.out.println("Array is already sorted");
} else {
    System.out.println("array is not sorted");
}

        

    }
    
}
