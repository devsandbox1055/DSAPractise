import java.util.*;

public class ReverseAQueue {
    public static void main(String[] args){
        Queue<Integer> q  = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4);
        //printing original queue
        System.out.println("original queue= " + q);
        reverse(q);
        System.out.println("reversed Quesue:" + q);
    }
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        //queue se stack
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
        //stack - queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
}
