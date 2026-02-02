//Top se elements pop karte jao
//Jab desired index mil jaaye → peek kar lo
//Baaki elements temp stack mein
//End mein stack wapas bana do


import java.util.Stack;

public class PeakInStack {
    public static void main(String[] args) {

        //pehle 2 stack banao
        Stack<Integer> st = new Stack<>(); 
        
        // phir pehle stack mein element push karo
        st.push(10);
        st.push(40);
        st.push(-2);
        st.push(30);
        st.push(90);

        int idx = 2;

        Stack<Integer> temp = new Stack<>();
        int value = -1;

        for (int i = 0; i <= idx; i++) {
            value = st.pop();        //top se element pop
            temp.push(value);
        }

        System.out.println("Peeked value: " + value);

        // restore original stack
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        System.out.println("Original Stack: " + st);

        }

}

