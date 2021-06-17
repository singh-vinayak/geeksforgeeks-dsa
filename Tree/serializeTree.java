//serialize a binary tree into array/string
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

class serializeTree {

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);

        ArrayList<Integer> arr = new ArrayList<>();
        serialize(root, arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    static final int EMPTY = -1;

    public static void serialize(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(EMPTY);
            return;
        }
        arr.add(root.key);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }
}