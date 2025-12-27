public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        // Print original array
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {   // number of passes
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("\nSorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
