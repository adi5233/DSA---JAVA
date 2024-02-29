package tree;

class Node {
    int data;
    Node left, right;
    Node(int v) {
        data = v;
        left = right = null;
    }
}

public class InOrderTraversal {
    public static void printInorder(Node root){
        if(root != null){
            printInorder(root.left);
            System.out.print(root.data + " "); // Add space after printing data
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println("Inorder traversal of binary tree is: ");
        printInorder(root); // Call the printInorder method to print the inorder traversal
    }
}
