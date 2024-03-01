package linkedList.singlyLinkedList;

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class DeleteLastSL {
    public static void deleteLast(Node head){
        Node curr = head;
        while( curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;

        // print the linkedlist
        Node currPrint = head;
        while( currPrint != null) {
            System.out.print(currPrint.data + " ");
            currPrint = currPrint.next;
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

        deleteLast(head);
    }
}
