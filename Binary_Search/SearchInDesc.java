public class SearchInDesc {
    public static void main(String[] args) {
         int[] arr  = {9, 8, 7, 6, 5, 3, 1};
        int target  = 7;
        int n =arr.length;
        int lo = 0; 
        int hi = n-1;
        
        while(lo<=hi) {
            int mid  = (lo+hi)/2;
            
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }                   
            else if(arr[mid] < target){ //// target LEFT side mein hoga
                hi = mid-1;

            }
            else {
                lo = mid +1;
            }
        }
        System.out.println("element not found");
    }
    
}
