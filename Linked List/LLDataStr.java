class Node { //user defined data type
    int val;
    Node next;
    Node(int val){ //iski default value null hai
        this.val = val;
    }
}
class Linkedlist{ //user defined data structure
    Node head; //default se hi null hai
    Node tail; //default se hi null hai
    
    void addAtHead(int val){
        Node temp  = new Node(val);
        if(head == null)head = tail = temp; //agar linkedL khaali hai to uske liye hai
        else{
            temp.next = head;
            head = temp;
        }
    }
    void addAtTail(int val){
         Node temp  = new Node(val);
        if(tail == null)head = tail = temp; //agar linkedL khaali hai to uske liye hai
        else{
            tail.next = temp;
            tail = temp;
    }
}
void deleteAtHead(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    head  = head.next;
    if(head == null) tail = null;
}

void display() {
        if(head==null) return;
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

    }
    public class LLDataStr {
        public static void main(String[] args) {
            Linkedlist ll = new Linkedlist();
            ll.addAtTail(10);
            ll.addAtTail(20);
            ll.addAtTail(40);
            ll.addAtTail(40);
            ll.display();
            ll.addAtHead(50);
            ll.display();
            ll.deleteAtHead(); 
            ll.display();
    }  
}
}
