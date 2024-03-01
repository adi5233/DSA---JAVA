package linkedList.singlyLinkedList;

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class InsetAtPositionSL {
     public static void insertAtPos(Node head, int x, int y){
        Node temp = new Node(x);

        Node curr = head;
        int position = y;

        if(position == 1){
            temp.next = head;
            head = temp;
            return;
        }

        int totalLoops = position - 2;
        for(int i = 1; i <= totalLoops; i++){
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;

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

        insertAtPos(head, 60, 3);
    }
}
