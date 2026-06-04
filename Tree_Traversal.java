class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class Tree1{
    public static void main(String args[]){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        displayPreorder(a);
        System.err.println();
        displayInorder(a);
        System.out.println();
        displayPostorder(a);
    }
    public static void displayPreorder(Node root){
        if(root==null) return;
        System.out.print(root.val+"  ");
        displayPreorder(root.left);
        displayPreorder(root.right);
    }
    public static void displayInorder(Node root){
        if(root==null) return;
        displayInorder(root.left);
        System.out.print(root.val+"  ");
        displayInorder(root.right);
    }
    public static void displayPostorder(Node root){
        if(root==null) return;
        displayPostorder(root.left);
        displayPostorder(root.right);
        System.out.print(root.val+"  ");
    }
}
