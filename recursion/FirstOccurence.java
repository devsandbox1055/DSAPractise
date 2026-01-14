public class FirstOccurence {
    public static int firstO(int[] arr ,  int index , int target){

        //base case end of an array
        if(index == arr.length){
            return -1;
        }
        //if element found
        if(arr[index] == target){
            return index;

        }
        //recrusive call
        return firstO(arr, index+1, target);
    }
    public static void main(String[] args){
        int[] arr  = {4,2,7,2,5,2};
        int target  = 2;

        int ans = firstO(arr, 0, target);
        System.out.println("first occurence index " + ans);
    }    
    }


