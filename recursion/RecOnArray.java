public class RecOnArray {
    public static void main(String[] args){
        int[] arr  = {1,2,3,4};
        recPrint(arr,0); // idx = 0 index
    }
    public static void recPrint(int[] arr ,  int idx){
        if(idx == arr.length) return; //base case
        System.out.print(arr[idx]);
        recPrint(arr, idx+1);
    }
    
}
