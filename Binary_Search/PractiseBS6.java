//Question - Kth smallest element in sorted
//matrix[][][]

public class PractiseBS6 {
    public static int Ksmall(int[][] matrix , int k){
        int n = matrix.length;

        int low  = matrix[0][0];
        int high = matrix[n-1][n-1];

        while(low<high){
            int mid  = low+(high-low)/2;
             
            int count  = CountLessEqual(matrix,mid);
            //kitne element hai vo count ke liye
            if(count<k) {
                low  = mid+1;
            
            } else {
                high  = mid;

            }
        }
        return low;
    }
    private static int CountLessEqual(int[][] matrix , int mid) {
        int n = matrix.length;
        int row  = 0;
        int col = n-1;
        int count = 0;

        while (row < n && col >= 0) {
        if (matrix[row][col] <= mid) {
            count += (col + 1);
            row++;
        } else {
            col--;
        }
    }

    return count;
}
public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };

        int k = 8;

        System.out.println("Kth Smallest Element = " + Ksmall(matrix, k));
    }    
} 

