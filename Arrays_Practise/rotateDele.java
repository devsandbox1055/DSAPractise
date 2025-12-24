public class rotateDele {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n  = arr.length;
        int d = 2;

        //pehle (first d) elements ko rotate karna hai
        reverse(arr,0,d-1);

        //remaining elements ko reverse karna hai
        reverse(arr,d,n-1);

        //uske baad saare elements ko reverse kar do
        reverse(arr,n , n-1);

        
    }
  
    //ab function banate hai
    static void reverse(int[] arr, int i , int j) {
        //ye jo upar bracket mein hai(int[] arr, int i , int j),
        //ye sabse upar waale bracket ke liye (arr,d,n-1)
        //parameter hai.
        while(i<j);
        int temp  =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}
