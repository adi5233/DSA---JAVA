package linkedList.singlyLinkedList;

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class TraversalOfSL {
    public static void traversalOfSL(Node head){
        Node curr = head;
        while( curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String args[]){
        Node head = new Node(10);
        Node x2 = new Node(20);
        Node x3 = new Node(30);
        Node x4 = new Node(40);
        Node x5 = new Node(50);
        head.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;

        traversalOfSL(head);
    }
}
