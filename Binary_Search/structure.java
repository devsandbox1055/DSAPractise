public class structure {
    public static void main(String[] args) {
        
        int[] arr  = {1,2,3,4,3,3,3,5,6,7,8};
        int target  = 3;
        int n =arr.length;
        int lo = 0; 
        int hi = n-1;
        
        while(lo<=hi) {
            int mid  = (lo+hi)/2;
            
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }                   
            else if(arr[mid] < target){
                lo = mid+1;

            }
            else {
                hi = mid-1;
            }
        }
        System.out.println("element not found");
    }
}