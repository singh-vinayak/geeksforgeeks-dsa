import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class preorderIterative {

    Node root;

    preorderIterative() {
        root = null;
    }

    void printPreorder(Node root) {
        if(root == null)
            return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.isEmpty()==false)
        {
            Node curr=st.pop();
            System.out.print(curr.key+" ");
            if(curr.right!=null)
                st.push(curr.right);
            if(curr.left!=null)
                st.push(curr.left);
        }
    }

    public static void main(String[] args) {
        preorderIterative tree = new preorderIterative();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nPreorder traversal of binary tree is ");
        tree.printPreorder(tree.root);

    }


//better optimized function
void printPreorderOptimized(Node root) {
        if(root == null)
            return;
        Stack<Node> st = new Stack<>();
        Node curr= root;
        while(curr!=null || st.isEmpty()==false)
        {
            while(curr!=null)
            {
                System.out.print(curr.key+" ");
                if(curr.right!=null)
                    st.push(curr.right);
                curr=curr.left;
            }
            if(st.isEmpty()==false)
                curr=st.pop();
        }
    }
}