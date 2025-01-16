package DoublyLinkedList;

import java.util.Scanner;
import DoublyLinkedList.MyDoublyLinkedList.*;

import static DoublyLinkedList.MyDoublyLinkedList.head;
import static DoublyLinkedList.MyDoublyLinkedList.tail;

public class ClientApp {
    public static void main(String[] args) {
        MyDoublyLinkedList head=new MyDoublyLinkedList();
        addNode();
        addNode();
        addNode();
        printList();

    }

    public static void addNode()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter data for node...");
        int data = sc.nextInt();

        Node newNode=new Node(data);
        newNode.next=head.next;
        head.next.prev=newNode;
        head.next=newNode;
        newNode.prev=head;
    }

    public static void printList()
    {
        Node curr=head.next;
        while(curr!=tail)
        {
            System.out.print(curr.data+"<->");
            curr=curr.next;
        }
        System.out.print("NULL");
    }
}
