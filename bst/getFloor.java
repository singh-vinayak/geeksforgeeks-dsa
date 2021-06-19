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

class getFloor {

    public static void main(String args[]) {
        Scanner ob=new Scanner(System.in);
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = ob.nextInt();

        System.out.print("Floor: " + (floor(root, x).key));
    }

    public static Node floor(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x)
                return root;
            else if (root.key > x)
                root = root.left;
            else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }
}
