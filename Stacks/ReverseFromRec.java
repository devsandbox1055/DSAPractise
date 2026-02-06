import java.util.Stack;

public class ReverseFromRec {

    public static void pushatbottom(Stack<Integer> st , int x){

        //base case 
        //agar stack empty hua to

        if(st.isEmpty()){
            st.push(x);
            return;

        }
        //main logic
        int top  = st.pop();
        pushatbottom(st, x);
        st.push(top);
    }
//abb ek reverse function
private static void reverse(Stack<Integer> st){
    //base case
    if(st.size()<=1) return;

    //main logic to reverse
    int top  = st.pop();
    reverse(st);
    pushatbottom(st, top);
}


    
}
