package tree;

class Node {
    int data;
    Node left, right;
    Node(int k){
        data = k;
        left = right = null;
    }
}
public class PostOrderTraversal {

    public static void printPostorder(Node root){
        if(root != null){
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.data);
            System.out.print(" ");
        }
    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println("Postorder traversal of binary tree is: ");
        printPostorder(root); 
    }
}
