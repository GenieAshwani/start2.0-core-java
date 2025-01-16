package DoublyLinkedList;

public class MyDoublyLinkedList {

   static Node head;
   static Node tail;
  MyDoublyLinkedList()
  {
      Node head=new Node(-1);
      Node tail=new Node(-1);
      head.next=tail;
      tail.prev=head;
      this.head=head;
      this.tail=tail;
  }
}
