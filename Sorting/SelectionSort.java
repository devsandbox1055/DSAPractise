public class SelectionSort {

    // Function to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        System.out.print("Original Array: ");
        printArray(arr); //printing same array

        // Selection Sort Logic
        for (int i = 0; i < n - 1; i++) {

            // Step 1: Assume current index has minimum value
            int minIndex = i;

            // Step 2: Find minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Step 3: Swap minimum element with current index
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
