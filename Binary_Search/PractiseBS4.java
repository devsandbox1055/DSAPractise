//Question - Floor and Ceil in a Sorted Array
public class PractiseBS4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};
        int low  = 0;
        int high = arr.length -1;
        int x = 5;
        int floor  = -1;
        int ceil = -1;

        while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == x) {
            floor = arr[mid];
            ceil = arr[mid];
            break;
        } 
        else if (arr[mid] < x) {
            floor = arr[mid];      // possible floor
            low = mid + 1;
        } 
        else {
            ceil = arr[mid];       // possible ceil
            high = mid - 1;
        }
    }
    System.out.println("floor = " + floor);
    System.out.println("ceil = " + ceil);
}
        
    }
    

