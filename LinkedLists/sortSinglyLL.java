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


public class sortSinglyLL {
    static Node sortAscending(Node head){
        Node curr=head;
        for(Node i=curr;i.next!=null;i=i.next)
        {
            for(Node j=i.next;j!=null;j=j.next)
            {
                if(j.data<i.data)
                {
                    int temp=j.data;
                    j.data=i.data;
                    i.data=temp;
                }
            }
        }
        return head;
    }
    static Node insertEnding(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static void main(String args[]) {
        Node head = null;
        head = insertEnding(head, 45);
        head = insertEnding(head, 20);
        head = insertEnding(head, 25);
        head = insertEnding(head, 10);
        head = insertEnding(head, 15);
        head = insertEnding(head, 40);
        printlist(head);
        head=sortAscending(head);
        System.out.println();
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
