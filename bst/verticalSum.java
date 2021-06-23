//calculate vertical sum
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

class verticalSum {

    public static void vSumR(Node root, int hd, TreeMap<Integer, Integer> mp) {
        if (root == null)
            return;
        vSumR(root.left, hd - 1, mp);
        int pSum = (mp.get(hd) == null) ? 0 : mp.get(hd);
        mp.put(hd, pSum + root.key);
        vSumR(root.right, hd + 1, mp);
    }

    public static void vSum(Node root) {
        TreeMap<Integer, Integer> mp = new TreeMap<Integer, Integer>();
        vSumR(root, 0, mp);
        for (Map.Entry sum : mp.entrySet())
            System.out.print(sum.getValue() + " ");
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(50);
        root.left.left = new Node(30);
        root.left.right = new Node(40);

        vSum(root);
    }
}