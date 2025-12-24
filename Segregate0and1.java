public class Segregate0and1 {
    public static void main(String[] args) {
        
        int[] arr = {1,0,0,0,0,0,1,1,1,2,2,2,0,1,2};

        int left = 0;  // left pointer start se
        int right = arr.length - 1; // right pointer end se

        while (left < right) {  // jab tak pointers cross na ho

// Agar left par EVEN hai → sahi jagah → aage badho
            if (arr[left] % 2 == 0) {
                left++;
            }

 // Agar right par ODD hai → sahi jagah → peeche jao
            else if (arr[right] % 2 != 0) {
                right--;
            }

// left par ODD & right par EVEN → galat jagah → swap
            else {
                int temp = arr[left];     // temporary variable
                arr[left] = arr[right];   // even left side
                arr[right] = temp;        // odd right side
                left++;                   // dono pointers move
                right--;
            }
        }

        // Result print
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

