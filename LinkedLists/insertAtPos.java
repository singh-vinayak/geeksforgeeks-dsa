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

public class insertAtPos {

    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    static Node insertPos(Node head, int x, int pos) {
        Node temp = new Node(x);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos - 2; i++)
            curr = curr.next;
        if (curr == null)
        {
            System.out.println("position out of range");
            return head;
        }
            
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void main(String args[]) {
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        printlist(head);

        int val, p;
        Scanner ob = new Scanner(System.in);
        System.out.println();
        val = ob.nextInt();
        p = ob.nextInt();
        head = insertPos(head, val, p);
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