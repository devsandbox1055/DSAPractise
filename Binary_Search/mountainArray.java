public class mountainArray {
    public static void main(String[] args){
        int[] arr =  {1, 3, 5, 7, 6, 4, 2};
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int ans  =-1;

        while(low<=high){
            int mid  = low +(high-low)/2;
            if(arr[mid] < arr[mid+1]){
                //increasing part
                low = mid+1;

            } else {
                high  = mid;
            }
        }
        System.out.println("peak index = " + low);
        System.out.println("peak element = " + arr[low]);
    
    }

    
}
