import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public ArrayList<Integer> nextlargerelement(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;

        //ek empty stack banao
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]); //array ke last 2nd element ko stack mein push kiya
        //last 2nd element se lekar first element tak loop chalao
        for(int i = n-1;i>=n;i--){
            //jabtak stack ka size 0 se bada hai aur
            // arr ke index ki value badi hai stack ke peak se
            //tabtak stack ke elements ko pop karate raho
            while(st.size()>0 && arr[i]>st.peak()) st.pop();
            //agar stack ka size zero ke equal hai 2nd array mein -1 put kar do
            //nahi to 2nd array ka index  = stack ke peak 
            if(st.size() == 0) nge[i] = -1;
            else nge[i] = st.peak();
            st.push(arr[i]); //arr ke ele ko phir se stack mein push
        }
        ArrayList<Integer> ans = new ArrayList<>(n);
        for(int i =0; i<n;i++){
            ans.add(nge[i]);
        }
        return ans;
    }
}