//java implements priority queue
//using Min Heap by default
// Java program to demonstrate working of
// PriorityQueue in Java
import java.util.*;

class PriorityQ {
    public static void main(String args[]) {
        // Creating empty priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Printing the top element again
        System.out.println(pq.peek());
    }
}

//using max heap as below
// public static void main(String args[])
//     {
//         // Creating empty priority queue
//         PriorityQueue<Integer> pq 
//         = new PriorityQueue<Integer>(
//             Collections.reverseOrder());

//         // Adding items to the pQueue using add()
//         pq.add(10);
//         pq.add(20);
//         pq.add(15);
        
//         // Above PriorityQueue is stored as following
//         //       20
//         //      /  \
//         //    10    15

//         // Printing the top element of PriorityQueue
//         System.out.println(pq.peek());

//         // Printing the top element and removing it
//         // from the PriorityQueue container
//         System.out.println(pq.poll());

//         // Post poll() PriorityQueue looks like
//         //       15
//         //      /  
//         //    10   

//         // Printing the top element again
//         System.out.println(pq.peek());
//     }