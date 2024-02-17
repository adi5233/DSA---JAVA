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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
 
        // Function call
        System.out.println(" ");
        System.out.println(
            "Preorder traversal of binary tree is: ");
        printPreorder(root);
    }
}
