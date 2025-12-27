public class BubbleSortOReverse {
    public static void main(String[]  args) {
        int[] arr  = {1,3,5,6,7,8,1};
        int n = arr.length;

        //print original array
        System.out.println("original array: " );
        printArray(arr);


        //ab optimized bubble sort ka logic 
        for(int i =0; i<n-1; i++){
            boolean swapped = false;
            for(int j  = 0; j<n-i-1; j++){
                if(arr[j] < arr[j+1]) { //reverse aur normal mein sirf ek cheez chnage karna padta hai
                    
                    //swap karwa do
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true; 
                }
            }
            //if not swapped , to array pehle se sorted hai
            if(!swapped) {
                break;

            }
        }
        System.out.println("\nSorted array :");
        printArray(arr);

    }
    //ab print karana hai sorted array ko
    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] +" ");
    }
}
}