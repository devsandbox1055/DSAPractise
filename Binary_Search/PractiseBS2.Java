public class PractiseBS2 {

    public static int findMin(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {

            // Case 1: Array already sorted
            if (arr[low] <= arr[high]) {
                return arr[low];
            }

            int mid = low + (high - low) / 2;

            // Neighbours (circular array)
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            // Case 2: Mid is minimum
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return arr[mid];
            }

            // Case 3: Left side sorted → go right
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            }
            // Case 4: Right side sorted → go left
            else {
                high = mid - 1;
            }
        }
        return -1; // should never reach here
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 0, 1, 2};
        System.out.println("Minimum element: " + findMin(arr));
    }
}
