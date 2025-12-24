public class twopointerp1 {
    public static void main(String[] args) {
        int[] arr =  {1,2,4,6};
        int target = 6;

        int left = 0;
        int right = arr.length-1;

        while(left <right) {
            int sum =  arr[left] + arr[right];

            if(sum==target){
                System.out.println(arr[left]+ " " + arr[left]);
                break;

            } else if (sum <target) {
                right--;

            } else {
                left++;
            }


        
        }
       }
}