import java.util.Stack;


public class ParenthesisChecker {
    public static void main(String[] args) {
        
    }
    static boolean isBalanced(String s){
        int n = s.length();
        if(n%2 == 1) return false;
        Stack<Character> st  = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else { //agar closing bracket aaya
                if(st.size()==0) return false;
                char top  = st.peak();
                if(sameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }
    static boolean sameStyle(char ch, char top) {
        if(a =='(' && b ==')') return true;
        if(a =='{' && b =='}') return true;
        if(a =='[' && b ==']') return true;
        return false;


    }
}    

