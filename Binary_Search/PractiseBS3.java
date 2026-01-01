public class PractiseBS3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4};
        int x = 3; 
        int first = -1;
        int last  = -1;

        int first = firstOccurrence(arr, x);
        if (first == -1) return 0;

        int last = lastOccurrence(arr, x);
        return last - first + 1;
    }

    int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;   // move left
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;    // move right
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
