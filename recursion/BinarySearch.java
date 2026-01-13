
//IMPORTANT CODE

public class BinarySearch {

    public static int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private static int binarySearch(int[] nums, int target, int low, int high) {

        // Base case 
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        // Element found
        if (nums[mid] == target) {
            return mid;
        }

        // Search right half
        if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, high);
        }

        // Search left half
        return binarySearch(nums, target, low, mid - 1);
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
