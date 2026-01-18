public class FirstOccurence {
    public static int fo(int[] arr,int idx, int target) {
        //pehle base case
        if(idx == arr.length) {
            return -1;

        }
        if(arr[idx] == target){
            return idx;

        }
        return fo(arr, idx+1, target);

    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,2,5};
        int target = 2;

        int ans  = fo(arr, 0, target);
        System.out.println("your answer is = " + ans);
    }
}
