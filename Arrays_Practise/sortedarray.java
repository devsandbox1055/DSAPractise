public class sortedarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,23,2};
        boolean isSorted = true;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;

            }
        }
        System.out.println(isSorted);
        
    }
    
}
