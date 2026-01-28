import java.util.*;

public class Main{

    //Node class
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Merger sort ke liye function
    static Node mergeSort(Node head){
        if(head == null || head.next== null)
            return head;

        //2 temp node banana hai slow and fast
        Node slow  = head;
        Node fast  = head.next;

        while(fast != null && fast.next != null) {
            slow =  slow.next;
            fast  = fast.next.next;  //ye dono speed ke liye hai
            // ek ki speed x aur dusre ki 2x

        }
        Node mid = slow.next;
        slow.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return merge(left,right);
    }
}