import java.util.Stack;
public class Basics{
    public static void main(String[] args){
        Stack<String> st = new Stack<>();
        st.push("hi");
        st.push("hii");
        st.push("hiii");
        st.push("hiiii");
        st.push("hiiiii");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
    }
}