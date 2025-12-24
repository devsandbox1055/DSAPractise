public class missingarray  {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4};
        int n = 5;
        
        int expectedsum = n*(n-1)/2;
        int actualsum = 0;

        //logic for sum formula
        for(int i =0; i<5;i++) {
            actualsum += arr[i];

        }
        
        int missingnumber  = actualsum - expectedsum;
        System.out.println("your missing number=" + missingnumber);
 
 
    }
}