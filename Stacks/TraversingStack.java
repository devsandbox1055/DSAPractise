import java.util.Stack;

public class TraversingStack {
    public static void main(String[] args) {

        //pehle 2 stack banao
        Stack<Integer> st = new Stack<>(); 
        Stack<Integer> st2 = new Stack<>();

        // phir pehle stack mein element push karo
        st.push(10);
        st.push(40);
        st.push(-2);
        st.push(30);
        st.push(90);

        // Traversing the stack (LIFO order)
        while (st.size() > 0) {
            int top = st.pop();
            System.out.println(top);   // traversal / print
            st2.push(top);            // store in another stack
        }

        // restoring original stack
        while (st2.size() > 0) {
            st.push(st2.pop());
        }
}
}
