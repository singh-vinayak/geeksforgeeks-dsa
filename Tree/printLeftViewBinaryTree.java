//print the left view of a binary tree
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

class printLeftViewBinaryTree {

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        printLeftView(root);
    }

    static int maxLevel = 0;

    public static void printLeft(Node root, int level) {
        if (root == null)
            return;
        if (maxLevel < level) {
            System.out.print(root.key + " ");
            maxLevel = level;
        }
        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
    }

    public static void printLeftView(Node root) {
        printLeft(root, 1);
    }
}


//another method is to use line by line part 2 approach with an extra condition- only print the first node in each level
// method 2 using nested loops


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

// class levelOrderP2 {

//     public static void main(String args[]) {
//         Node root = new Node(10);
//         root.left = new Node(20);
//         root.right = new Node(30);
//         root.left.left = new Node(40);
//         root.left.right = new Node(50);
//         root.right.left = new Node(60);
//         root.right.right = new Node(70);

//         printLeft(root);
//     }

//     public static void printLeft(Node root) {
//         if (root == null)
//             return;
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         while (q.isEmpty() == false) {
//             int count = q.size();
//             for (int i = 0; i < count; i++) {
//                 Node curr = q.poll();
//                 if(i==0)
//                      System.out.print(curr.key + " ");
//                 if (curr.left != null)
//                     q.add(curr.left);
//                 if (curr.right != null)
//                     q.add(curr.right);
//             }
//             System.out.println();
//         }
//     }
// }