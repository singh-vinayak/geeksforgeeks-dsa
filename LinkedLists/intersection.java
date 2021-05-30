//print the node common in 2 linked lists

//hashing method o(m+n) time, o(m) auxillary space for hash set used
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

class intersection {

    public static void main(String args[]) {
        /*
         * Creation of two linked lists
         * 
         * 1st 3->6->9->15->30 2nd 10->15->30
         * 
         * 15 is the intersection point
         */

        Node newNode;

        Node head1 = new Node(10);

        Node head2 = new Node(3);

        newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        System.out.print(getIntersection(head1, head2));
    }

    static int getIntersection(Node head1, Node head2) {
        HashSet<Node> s = new HashSet<>();
        Node curr = head1;
        while (curr != null) {
            s.add(curr);
            curr = curr.next;
        }
        curr = head2;
        while (curr != null) {
            if (s.contains(curr))
                return curr.data;
            curr = curr.next;
        }
        return -1;
    }
}


//without using auxillary space

// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class LinkedList {

//     static Node head1, head2;

//     static class Node {

//         int data;
//         Node next;

//         Node(int d) {
//             data = d;
//             next = null;
//         }
//     }

//     int getNode() {
//         int c1 = getCount(head1);
//         int c2 = getCount(head2);
//         int d;

//         if (c1 > c2) {
//             d = c1 - c2;
//             return _getIntesectionNode(d, head1, head2);
//         } else {
//             d = c2 - c1;
//             return _getIntesectionNode(d, head2, head1);
//         }
//     }

//     int _getIntesectionNode(int d, Node node1, Node node2) {
//         int i;
//         Node current1 = node1;
//         Node current2 = node2;
//         for (i = 0; i < d; i++) {
//             if (current1 == null) {
//                 return -1;
//             }
//             current1 = current1.next;
//         }
//         while (current1 != null && current2 != null) {
//             if (current1.data == current2.data) {
//                 return current1.data;
//             }
//             current1 = current1.next;
//             current2 = current2.next;
//         }

//         return -1;
//     }

//     int getCount(Node node) {
//         Node current = node;
//         int count = 0;

//         while (current != null) {
//             count++;
//             current = current.next;
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.head1 = new Node(3);
//         list.head1.next = new Node(6);
//         list.head1.next.next = new Node(9);
//         list.head1.next.next.next = new Node(15);
//         list.head1.next.next.next.next = new Node(30);

//         list.head2 = new Node(10);
//         list.head2.next = new Node(15);
//         list.head2.next.next = new Node(30);

//         System.out.println(list.getNode());
//     }
// }
