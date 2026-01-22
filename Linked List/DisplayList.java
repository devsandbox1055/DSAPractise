public class DisplayList {
    public static void reversedisplay(Node head){
        if(head == null) return;
        reversedisplay(head.next);
        System.out.print(head.val+" ");
    }

    public static void displayRec(Node head) {
        if(head==null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

        //Recursion se 

    }

    public static void main(String[] args) {

        Node a =  new Node(10); //Node@7344699f
        Node b =  new Node(20);
        Node c =  new Node(30);
        Node d =  new Node(40);
        Node e =  new Node(50);

        a.next = b;
        b.next = c;
        c.next = d; 
        d.next = e;
        
        // display(a);
        // reversedisplay(a);
        System.out.println(get(a, 3));
        
        //Node n = null nahi ho sakta
        //koi value bhi nahi ho sakta
        //null pointer exception de dega
        //null ko next tak nahi jaane dena

    }
    private static int get(Node head , int idx){
        Node temp = head;
        for(int i = 1;i<=idx;i++){
            temp = temp.next;

        }
        return temp.val;
    }
}   