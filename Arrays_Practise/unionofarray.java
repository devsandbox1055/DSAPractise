public class unionofarray{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        int i = 0;
        int j = 0;
        
        while(i<arr1.length && j<arr2.length) {
            
            if(arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;

            } else if(arr1[i] > arr2[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                //both equal
                System.out.print(arr1[i] + " ");
                i++;
                j++; 

            }
     }
      while(i<arr1.length) {
        System.out.print(arr1[i] + " ");
        i++;

    } 
    while(j<arr2.length) {
        System.out.print( arr2[j] + " ");
        j++;
    }

    }
}
