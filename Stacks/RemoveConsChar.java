import java.util.Stack;


public class RemoveConsChar {
    public static String compressString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {  //Har iteration me ek character ch me aayega
            // agar stack empty ya last char alag hai
            if (stack.isEmpty() || stack.peek() != ch) { //Agar different hai → add  // Agar same hai → skip
                stack.push(ch);
            }
        }

        // stack se result banao
        StringBuilder result = new StringBuilder(); //for converting stack to string
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbbccccdaa";
        System.out.println(compressString(s)); // abcda
    }
    
}
