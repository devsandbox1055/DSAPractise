class Node {
    int val;
    Node next;   // small n (fix)

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MyQueue {
    Node head;
    Node tail;
    int size;

    // Peek
    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.val;
    }

    // Remove (Dequeue)
    int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int front = head.val;
        head = head.next;
        size--;

        if (size == 0) {   // Important fix
            tail = null;
        }

        return front;
    }

    // Add (Enqueue)
    void add(int val) {
        Node temp = new Node(val);

        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;

        }
        System.out.println();

    }
}
