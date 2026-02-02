import java.util.ArrayList;
import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args){

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.push(10);
        st1.push(40);
        st1.push(22);
        st1.push(30);
        st1.push(90);

        ArrayList<Integer> list = new ArrayList<>(st1);

        System.out.println(list);
        System.out.println(st1);
        st2.addAll(list);
        System.out.println(st2);

        //agar reverse order chahiye to
        //for loop use karenge
        for (int i = list.size()-1; i>=0; i--){
            st2.push(list.get(i));
        }
    }
}
