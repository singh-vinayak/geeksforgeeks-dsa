//check if the tree is a bst or not

//first method- naive and not efficient

import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

class bstCheck {
    public static int maxValue(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int res = root.key;
        int lres = maxValue(root.left);
        int rres = maxValue(root.right);
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    public static int minValue(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        int res = root.key;
        int lres = minValue(root.left);
        int rres = minValue(root.right);
        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }

    public static int isBST(Node root) {
        if (root == null)
            return 1;

        if (root.left != null && maxValue(root.left) > root.key)
            return 0;

        if (root.right != null && minValue(root.right) < root.key)
            return 0;

        if (isBST(root.left) == 0 || isBST(root.right) == 0)
            return 0;

        return 1;
    }

    public static void main(String args[]) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        if (isBST(root) == 1)
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}


//method second - correct and efficient

// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Node {
//     int key;
//     Node left, right;

//     Node(int x) {
//         key = x;
//         left = right = null;
//     }
// }

// class Gfg {
//     public static boolean isBST(Node root, int min, int max) {
//         if (root == null)
//             return true;

//         return (root.key > min && root.key < max && isBST(root.left, min, root.key)
//                 && isBST(root.right, root.key, max));
//     }

//     public static void main(String args[]) {
//         Node root = new Node(4);
//         root.left = new Node(2);
//         root.right = new Node(5);
//         root.left.left = new Node(1);
//         root.left.right = new Node(3);

//         if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
//             System.out.println("IS BST");
//         else
//             System.out.println("Not a BST");
//     }
// }



//best method below

// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Node {
//     int key;
//     Node left, right;

//     Node(int x) {
//         key = x;
//         left = right = null;
//     }
// }

// class Gfg {
//     static int prev = Integer.MIN_VALUE;

//     public static boolean isBST(Node root) {
//         if (root == null)
//             return true;

//         if (isBST(root.left) == false)
//             return false;

//         if (root.key <= prev)
//             return false;
//         prev = root.key;

//         return isBST(root.right);
//     }

//     public static void main(String args[]) {
//         Node root = new Node(4);
//         root.left = new Node(2);
//         root.right = new Node(5);
//         root.left.left = new Node(1);
//         root.left.right = new Node(3);

//         if (isBST(root))
//             System.out.println("IS BST");
//         else
//             System.out.println("Not a BST");
//     }
// }