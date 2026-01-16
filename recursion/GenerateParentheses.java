import java.util.*;

public class GenerateParentheses {

    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        //To saare answers ko ek jagah collect karna padta hai ^^
        // recursion generates results one by one.
        backtrack(result, "" , 0 , 0 n);
        return result;
    }
    private static void backtrack(List<String> result, String current, int open, int close,int n) {


        //base case
        if(open == n){
            result.add(current);
            return;
        }
        //opening bracket
        if(open<n) {
            backtrack(result, current+"(", open+1,close,n);

        }
    
    }
}