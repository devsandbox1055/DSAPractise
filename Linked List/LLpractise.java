class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

public class LLpractise {
    //Reverse list
    public static void reversedisplay(Node head){
        if(head== null) return;
        reversedisplay(head.next);
        System.out.print(head.val+" ");
    }   
    // recursion ki help se
    public static void displayrec(Node head){
        if(head==null) return; //base case (jo recursion mein lagta hai)
        System.out.println(head.val+" ");
        displayrec(head.next);
    }
    
    //Normal tareeke se display karana
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
    }
    System.out.println();    
}

    public static void main(String[] args) {
        Node a  = new Node(10); //ye head node hota hai
        Node b  = new Node(20);
        Node c  = new Node(30);
        Node d  = new Node(40);

        a.next = b;

        System.out.println(a.next); // a.next = b
        System.out.println(b);

    }
    
}
