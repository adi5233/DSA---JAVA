package tree;

// Structure of a Binary Tree Node
class Node {
    int data;
    Node left, right;
 
    Node(int v)
    {
        data = v;
        left = right = null;
    }
}

// left --> root --> right
public class PreOrderTraversal {
    public static void printPreorder(Node root) {
        if(root != null){
            System.out.println(root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
 
        // Function call
        System.out.println(" ");
        System.out.println(
            "Preorder traversal of binary tree is: ");
        printPreorder(root);
    }
}
