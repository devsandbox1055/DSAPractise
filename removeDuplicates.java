public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3};  //from sorted arrays
        int  j = 0;

        for(int i = 0; i <arr.length; i++) {
            if(arr[j] != arr[i]) {

                arr[++j] = arr[i];

          for (int k = 0; k <= j; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\nNew length = " + (j + 1));
    }

}
    }
}
