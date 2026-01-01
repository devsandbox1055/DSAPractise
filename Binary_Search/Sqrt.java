public class Sqrt {
    public static void main(String[] args) {
        int n = 10;

        int low  = 0; 
        int high = n;
        int ans = 0;

        while (low <= high){
            int  mid  =  low+ (high -low)/2;

            if(mid * mid  == n) {
                ans  = mid;
                break;
                }
                else if (mid * mid < n){
                    ans = mid;
                    low  = mid +1;

                } else {
                    high  = mid -1
                }
 
                }
                System.out.println("square root of" + n + "is" + ans);
            }

    }
    

