import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

class reverseDLL {

    public static void main(String args[]) {
        Node head = insertBegin(null,10);
        head =insertBegin(head,20);
        head = insertBegin(head,30);
        head = insertBegin(head, 5);
        printlist(head);
        head=reverse(head);
        printlist(head);

    }

    static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null)
            head.prev = temp;
        return temp;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
        Node prev=null,curr=head;
        while(curr!=null)
        {
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
}