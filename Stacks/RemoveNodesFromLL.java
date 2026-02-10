import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>(); //ek stack banao
        ListNode curr = head;

        // Linked list traverse from left to right
        while (curr != null) { //jabtak stack empty na ho
            while (!stack.isEmpty() && stack.peek().val < curr.val) {
                stack.pop();
            }
            stack.push(curr);
            curr = curr.next;
        }

        // Linked list rebuild
        ListNode next = null;
        while (!stack.isEmpty()) {
            curr = stack.pop();
            curr.next = next;
            next = curr;
        }

        return next;
    }
}
