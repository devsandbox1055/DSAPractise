public class reverseP {
    // Reverses a stack using recursion
    public static void reverse(java.util.Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    private static void insertAtBottom(java.util.Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }
}
