package tree;

public class HeightOfTree {
    public static int getHeight(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println("Height of binary tree is: ");
        int height = getHeight(root);
        System.out.println(height);
    }
}
