import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}


public class inorderIterative {

    Node root;

    inorderIterative() {
        root = null;
    }

    void printInorder(Node root)
    {
        Stack<Node> st=new Stack<>();
        Node curr=this.root;
        while(curr !=null || st.isEmpty()==false)
        {
            while(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            System.out.print(curr.key+" ");
            curr=curr.right;
        }
    }

    public static void main(String[] args) {
        inorderIterative tree = new inorderIterative();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);

    }
}
