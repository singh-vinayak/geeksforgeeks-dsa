import java.io.*;
import java.util.*;

//naive approach - using sorted arrays;sorted here using insertion sort

// class medianOfStream {

//     public static void main(String[] args) {
//         double[] arr = new double[] { 25, 7, 10, 15, 20 };
//         int n = 5;
//         double[] temp = new double[n];
//         int size = 0;
//         for (int i = 0; i < n; i++) {
//             temp[i] = arr[i];
//             size++;
//             int j = i;
//             while (j > 0 && temp[j] < temp[j - 1]) {
//                 double a = temp[j];
//                 temp[j] = temp[j - 1];
//                 temp[j - 1] = a;
//                 j--;
//             }
//             if (size % 2 != 0)
//                 System.out.print(temp[size / 2] + " ");
//             else
//                 System.out.print(((temp[size / 2] + temp[(size - 1) / 2]) / 2) + " ");

//         }
//     }
// }

//using augmented BST

// class Node {
//     double data;
//     Node left, right;
//     int lCount;
//     Node(double x)
//     {
//         data = x;
//         left = right = null;
//         lCount = 0;
//     }
// }

// class medianUsingBST{

// public static Node insert(Node root, double x)
//     {
//         if (root == null)
//             return new Node(x);

//         if (x < root.data) {
//             root.left = insert(root.left, x);
//             root.lCount++;
//         }
     
//         else if (x > root.data)
//             root.right = insert(root.right, x);
//         return root;
//     }
     
//     public static Node kthSmallest(Node root, int k){
    
//         if (root == null)
//             return null;
     
//         int count = root.lCount + 1;
//         if (count == k)
//             return root;
     
//         if (count > k)
//             return kthSmallest(root.left, k);
     
//         return kthSmallest(root.right, k - count);
//     }
     
//     public static void main(String args[])
//     {
//         Node root = null;
//     	double[] keys =new double[] { 25, 7, 10, 15, 20};
//         int size=0;
        
//     	for (double x : keys){
//     	    size++;
//     		root = insert(root, x);
//     		double res;
//     	    if(size%2!=0){
//     	        res=(kthSmallest(root,(size/2)+1)).data;
//     	    }else{
//     	        res=(((kthSmallest(root,(size/2)+1)).data)+((kthSmallest(root,(size/2))).data))/2;
//     	    }
//     	    System.out.print(res+" ");
//     	}
//     }
// }

//efficient approach

class Node {
    double data;
    Node left, right;
    int lCount;

    Node(double x) {
        data = x;
        left = right = null;
        lCount = 0;
    }
}

class medianOfStream {

    public static void printMedians(int arr[], int n) {
        PriorityQueue<Integer> g = new PriorityQueue<Integer>();
        PriorityQueue<Integer> s = new PriorityQueue<Integer>(Collections.reverseOrder());
        s.add(arr[0]);
        System.out.print(arr[0] + " ");
        for (int i = 1; i < n; i++) {
            int x = arr[i];
            if (s.size() > g.size()) {
                if (s.peek() > x) {
                    g.add(s.poll());
                    s.add(x);
                } else
                    g.add(x);
                System.out.print(((double) (s.peek() + g.peek()) / 2) + " ");
            } else {
                if (x <= s.peek()) {
                    s.add(x);
                } else {
                    g.add(x);
                    s.add(g.poll());
                }
                System.out.print(s.peek() + " ");
            }
        }
    }

    public static void main(String args[]) {
        int keys[] = { 12, 15, 10, 5, 8, 7, 16 };

        printMedians(keys, 7);
    }
}
