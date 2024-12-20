package LinkedListQues;

import java.util.Scanner;

class Node {
        int data;
        Node next;
        Node(int data)
        {
        this.data=data;
        this.next=null;
        }
}
public class CustomLinkedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        Node newHead = addNodeBefore(head);
        printList(newHead);
    }

    public static void addNodeAfter(Node head)
    {
        Scanner sc=new Scanner(System.in);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        System.out.println("Enter the data for adding after node : ");
        int data = sc.nextInt();
        Node newNode=new Node(data);
        temp.next=newNode;

    }
    public static Node addNodeBefore(Node head)
    {
        Scanner sc=new Scanner(System.in);
        Node temp=head;

        System.out.println("Enter the data for adding before node : ");
        int data = sc.nextInt();
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;

    }

    private static void printList(Node head) {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

}
