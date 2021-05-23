import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class deleteEnd {

    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    static Node delEnd(Node head) {
        if (head == null) {
            System.out.println("nothing to delete. insert first");
            return head;
        }
        Node temp = head;
        while(temp.next.next!=null)
            temp=temp.next;
        temp.next=null;
        return head;
    }

    public static void main(String args[]) {
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        printlist(head);
        System.out.println("\nAfter deleting");
        head = delEnd(head);
        printlist(head);
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}