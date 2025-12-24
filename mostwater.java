public abstract class mostwater {
    public static void main(String[] args) {
        int[] arr =  {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = arr.length-1;
        int maxwater = 0;
        
        while(left < right) {
            int width  =  right- left;
            int minheight = Math.min(arr[right] , arr[left]);
            int water  = width*minheight;

            if(arr[left] < arr[right]) {
                left++;

            }else {
                right--;
            }




        }

        System.out.println(maxwater);
    }
}
