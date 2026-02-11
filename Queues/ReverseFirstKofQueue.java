import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKofQueue {
    public static void main(String[] args){
        Queue<Integer> q  = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4);
        int  k =3;
        //printing original queue
        System.out.println("original queue= " + q);
        reverseTillK(q , k );
        System.out.println("reversed Quesue:" + q);
    }
    public static void reverseTillK(Queue<Integer> q , int k){
        if(q.isEmpty() || k>q.size())
            return;

        Stack<Integer> st  = new Stack<>();
        //push first k element into stack
        for(int i =0; i<k;i++){
            st.push(q.remove());
        }
        //add stack element back to queue
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        //move remaining element to back
        int size = q.size();
        for(int i = 0; i<size-k;i++){
            q.add(q.remove());
        } 
    }
}
