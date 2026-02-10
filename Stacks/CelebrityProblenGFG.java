public class CelebrityProblenGFG {
    public int CelebrityProblenGFG(int arr[][]){
        int n = arr.length;
        Stack<Integer> st  = new Stack<>();
        for(int i = 0; i<n;i++){
            st.push(i);
        }
    while(st.size()>1){
        int a = st.pop();
        int b  = st.pop();
        boolean aFlag = true, bFlag = true;
        if(arr[a][b]==1) //agar a celeb nahi hua to
            aFlag = false;
        else 
            bFlag = false;

        if(arr[b][a]==1) //b celeb nahi hai
            bFlag = false;
            else
                aFlag = false;
            if(aFlag) st.push(a);
            if(bFlag) st.push(b);
    }
    }
    
}
