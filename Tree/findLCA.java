//find the lowest common ancestor if present
import java.util.*;
import java.io.*;
import java.lang.*;

class node {
    int key;
    node left;
    node right;

    node(int k) {
        key = k;
        left = right = null;
    }
}

class findLCA {

    public static void main(String args[]) {
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.right.left = new node(40);
        root.right.right = new node(50);
        int n1 = 20, n2 = 50;

        node ans = lca(root, n1, n2);
        System.out.println("LCA: " + ans.key);
    }

    public static boolean findPath(node root, ArrayList<node> p, int n) {
        if (root == null)
            return false;
        p.add(root);
        if (root.key == n)
            return true;

        if (findPath(root.left, p, n) || findPath(root.right, p, n))
            return true;

        p.remove(p.size() - 1);
        return false;
    }

    public static node lca(node root, int n1, int n2) {
        ArrayList<node> path1 = new ArrayList<>();
        ArrayList<node> path2 = new ArrayList<>();
        if (findPath(root, path1, n1) == false || findPath(root, path2, n2) == false)
            return null;
        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++)
            if (path1.get(i + 1) != path2.get(i + 1))
                return path1.get(i);
        return null;
    }
}


//efficient solution- assume that both values are present

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
//         Node root = new Node(10);
//         root.left = new Node(20);
//         root.right = new Node(30);
//         root.right.left = new Node(40);
//         root.right.right = new Node(50);
//         int n1 = 20, n2 = 50;

//         Node ans = lca(root, n1, n2);
//         System.out.println("LCA: " + ans.key);
//     }

//     public static Node lca(Node root, int n1, int n2) {
//         if (root == null)
//             return null;
//         if (root.key == n1 || root.key == n2)
//             return root;

//         Node lca1 = lca(root.left, n1, n2);
//         Node lca2 = lca(root.right, n1, n2);

//         if (lca1 != null && lca2 != null)
//             return root;
//         if (lca1 != null)
//             return lca1;
//         else
//             return lca2;
//     }
// }