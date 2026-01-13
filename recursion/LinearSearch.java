public class LinearSearch {
    public static void main(String[] args){
        int[] arr  = {1,2,3,4};
        int target = 4;
        System.out.println(exists(arr,target, 0));
    }
    public static boolean exists(int[] arr , int target, int idx) {
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return exists(arr, target, idx+1);
    }

    }