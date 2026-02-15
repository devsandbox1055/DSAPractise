class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class Implemention{
    public static void main(String[] args){
        Node a  = new Node(3);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(7);
        Node f = new Node(3);
        Node g = new Node(4);
        a.left = b; a.right =c;
        b.left =d; b.right = e;
        c.left = f; c.right  = g;
        display(a);
        System.out.println(size(a));
        sum(a);
        System.out.println(sum(a));
        max(a);
        System.out.println(max(a));
        levels(a);
        System.out.println(levels(a));
    }
    private static void display(Node root){
        if(root==null) return; 
        System.out.println(root.val+" ");
        display(root.left);
        display(root.right);

    }
 private static int size(Node root) {
       if(root==null) return 0;
       if(root.left==null && root.right==null) return 1;
       return 1 + size(root.left) + size(root.right);
   }
    private static int sum (Node root){
        if(root==null) return 0;
        return root.val+sum(root.left) + sum(root.right);
    } 
    private static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static int levels(Node root){
        if (root == null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));

}
}