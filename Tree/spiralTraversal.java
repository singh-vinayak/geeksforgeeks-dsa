//first method - using 2 stacks
import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

class spiralTraversal {

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        printSpiral(root);
    }

    public static void printSpiral(Node root) {
        if (root == null)
            return;
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.add(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.empty()) {
                Node temp = s1.peek();
                s1.pop();
                System.out.print(temp.key + " ");

                if (temp.right != null)
                    s2.add(temp.right);

                if (temp.left != null)
                    s2.add(temp.left);
            }

            while (!s2.empty()) {
                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.key + " ");

                if (temp.left != null)
                    s1.add(temp.left);
                if (temp.right != null)
                    s1.add(temp.right);
            }
        }
    }
}


//using 1c stack 1 queue in the level order traversal approach

// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Node {
//     int key;
//     Node left;
//     Node right;

//     Node(int k) {
//         key = k;
//         left = right = null;
//     }
// }

// class GFG {

//     public static void main(String args[]) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         printSpiral(root);
//     }

//     public static void printSpiral(Node root) {
//         if (root == null)
//             return;
//         Queue<Node> q = new LinkedList<>();
//         Stack<Integer> s = new Stack<>();
//         boolean reverse = false;
//         q.add(root);
//         while (q.isEmpty() == false) {
//             int count = q.size();
//             for (int i = 0; i < count; i++) {
//                 Node curr = q.poll();
//                 if (reverse)
//                     s.add(curr.key);
//                 else
//                     System.out.print(curr.key + " ");
//                 if (curr.left != null)
//                     q.add(curr.left);
//                 if (curr.right != null)
//                     q.add(curr.right);
//             }
//             if (reverse) {
//                 while (s.isEmpty() == false) {
//                     System.out.print(s.pop() + " ");
//                 }
//             }
//             reverse = !reverse;
//         }
//     }
// }