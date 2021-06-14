//check if the given binary tree is balanced or not.
// a tree is said to be abalanced
//if its left and right sub-trees
//have a max. height difference of 1


//n^2 solution
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

class balancedTree {

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);

        System.out.print(isBalanced(root));
    }

    public static boolean isBalanced(Node root) {
        if (root == null)
            return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        else
            return (1 + Math.max(height(root.left), height(root.right)));
    }
}

//efficient below

// public static void main(String args[]) {
//     Node root = new Node(10);
//     root.left = new Node(5);
//     root.right = new Node(30);
//     root.right.left = new Node(15);
//     root.right.right = new Node(20);

//     if (isBalanced(root) > 0)
//         System.out.print("Balanced");
//     else
//         System.out.print("Not Balanced");

// }

// public static int isBalanced(Node root){
//         if(root==null)
//             return 0;
//         int lh=isBalanced(root.left);
//         if(lh==-1)return -1;
//         int rh=isBalanced(root.right);
//         if(rh==-1)return -1;
        
//         if(Math.abs(lh-rh)>1)
//             return -1; 
//         else
//             return Math.max(lh,rh)+1;
//     }