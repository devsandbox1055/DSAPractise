import java.util.Stack;

public class PushAtBottom {
    
    //function to push at bottom
    public static void ppushatbottom(Stack<Integer> st, int x){

        //base case
        //agar stack empty hua to
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top  = st.pop(); //upar ke emelemt ko hata rahe hai
        ppushatbottom(st, x); //isse base case aa jaata hai, jisse pata cha; jaata hai ki stack empty ho gaya..aur base case ke vajah se st.push(5) ho gaya
        st.push(top); // uske baad phir se jo element top mein the ...unko stack mein daal diya
    }

    private static void reverse(Stack<Integer> st){
        if(st.size()<=1 ) return;
        int top  = st.pop();
        reverse(st);
        ppushatbottom(st, top);
    }
    public static void main(String[] args) {
         
        Stack<Integer> st  = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        ppushatbottom(st, 5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);


    }
}    



