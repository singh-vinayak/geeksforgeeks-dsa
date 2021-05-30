//insert data entered as a node in its appropriate prosition in a sorted singly linked list
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

public class insertInSortedLL {
    static Node sortedInsert(Node head, int x) {
        Node temp=new Node(x);
        if(head==null)
            return temp;
        if(x<head.data)
        {
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<x)
            curr=curr.next;
        temp.next=curr.next;
        curr.next=temp;
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
        head = insertEnding(head, 5);
        head = insertEnding(head, 10);
        head = insertEnding(head, 15);
        head = insertEnding(head, 20);
        head = insertEnding(head, 25);
        head = insertEnding(head, 40);
        printlist(head);
        head = sortedInsert(head,23);
        head = sortedInsert(head, 27);
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
