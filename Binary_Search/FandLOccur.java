public class FandLOccur {
    public static void main(String[] args) {
        int[] arr  = {1,1,2,2,4,5,5,6,6};
    int n = arr.length;
    int target  = 2;
    int lo = 0;
    int hi = n-1;
    int ans = -1; //agar answer na mile to -1 pe aa jaao

    while(lo<= hi){
        int mid = lo+(hi - lo)/2; //mid = 4

        //first case
        if(arr[mid] == target){ //m = 4 t = 2
            ans  = mid; //to window left side mein aa jaayegi
            lo = mid +1;
        }
        else if(arr[mid] < target) {
            lo = mid +1;


        } else {
            hi = mid -1;

        }
    }
    System.out.println("last occurrence index  = " +  ans);
}
}
