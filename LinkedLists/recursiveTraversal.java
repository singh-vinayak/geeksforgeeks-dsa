import java.util.*;
import java.io.*;
import java.lang.*;

public class recursiveTraversal{

    static class Node{

        int x;
        Node next;

        Node(int data){

            x=data;
            next=null;
        }
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp = head;
        head.next = temp1;
        temp1.next = temp2;
        normalPrint(head);
        head=temp;
        System.out.println("\nAfter Reversal- ");
        head=reverse(head);
        normalPrint(head);

    }

    static void normalPrint(Node curr){
        if(curr==null)
            return ;
        System.out.print(curr.x+" ");
        normalPrint(curr.next);
    }

    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;        
    }
}