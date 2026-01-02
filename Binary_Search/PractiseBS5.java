//Question :Find Smallest Letter Greater Than Target
public class PractiseBS5 {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        char target = 'd';
        int low = 0;
        int high = letter.length-1;
        char ans = letter[0];

        while(low<=high){
        int mid  = low +(high -low) / 2;

        if(letter[mid] > target){
            ans  =letter[mid];
            high = mid-1;

        
        }else {
            low  = mid+1;
        }



        }
        System.out.println(ans);
    }
    
}
