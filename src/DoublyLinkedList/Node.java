package DoublyLinkedList;

public class Node {

    int data;
    Node prev;
    Node next;
    Node head;
    Node tail;

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
        this.head=null;
        this.tail=null;
    }

}
